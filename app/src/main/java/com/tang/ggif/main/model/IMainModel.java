package com.tang.ggif.main.model;

import android.util.Log;

import com.tang.ggif.api.Constant;
import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;
import com.tang.ggif.main.MainService;
import com.tang.ggif.main.presenter.IMainPresenter;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tangyc on 2017/4/19.
 */

public class IMainModel implements MainModel {
    private  IMainPresenter presenter;
    public  IMainModel(IMainPresenter presenter)
    {
        this.presenter=presenter;
    }
    @Override
    public void loadSearchGifes(String word, String key) {
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        Retrofit retrofit=new Retrofit.Builder().baseUrl(Constant.GIF_API)
                .client(builder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MainService service= retrofit.create(MainService.class);
        service.getSearchGifes(word,key).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<SearchGifes>() {
            @Override
            public void accept(@NonNull SearchGifes searchGifes) throws Exception {
                if (searchGifes.getPagination().getCount() != 0) {
                    presenter.endLoad(searchGifes);
                } else {
                    presenter.emptyLoad();
                }
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                presenter.errorLoad();
            }
        });
    }

    @Override
    public void loadSearchTvs(String word) {
        OkHttpClient.Builder builder=new OkHttpClient.Builder();
        Retrofit retrofit=new Retrofit.Builder().baseUrl(Constant.TVMAZE_API)
                .client(builder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MainService service= retrofit.create(MainService.class);
        service.getSearchTvs(word).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<SearchTvs>>() {
            @Override
            public void accept(@NonNull List<SearchTvs> searchTvses) throws Exception {
                if(searchTvses.size()!=0)
                {
                    presenter.endLoad(searchTvses);
                }else{
                    Log.i("TAG","onEmpty");
                    presenter.emptyLoad();
                }
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(@NonNull Throwable throwable) throws Exception {
                presenter.errorLoad();
            }
        });
    }

}
