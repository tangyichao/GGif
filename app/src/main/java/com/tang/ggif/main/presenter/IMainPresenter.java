package com.tang.ggif.main.presenter;

import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;
import com.tang.ggif.main.model.IMainModel;
import com.tang.ggif.main.view.MainView;

import java.util.List;

/**
 * Created by tangyc on 2017/4/19.
 */

public class IMainPresenter implements MainPresenter {
    private  MainView mainView;
    private IMainModel mainModel;
    public IMainPresenter(MainView mainView){
        this.mainView=mainView;
        mainModel=new IMainModel(this);
    }
    @Override
    public void startLoad(String word, String key) {
        mainModel.loadSearchGifes(word,key);
        mainView.startLoad();
    }

    @Override
    public void endLoad(SearchGifes searchGifes) {
        mainView.endLoad(searchGifes);
    }

    @Override
    public void startLoadTvs(String word) {
        mainModel.loadSearchTvs(word);
        mainView.startLoad();
    }

    @Override
    public void endLoad(List<SearchTvs> searchTvse) {
        mainView.endLoad(searchTvse);

    }

    @Override
    public void errorLoad() {
        mainView.errorLoad();
    }

    @Override
    public void emptyLoad() {
        mainView.emptyLoad();
    }

}
