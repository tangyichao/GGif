package com.tang.ggif.main;

import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by tangyc on 2017/4/19.
 */

public interface MainService {
    @GET("gifs/search")
    Observable<SearchGifes> getSearchGifes(@Query("q") String word, @Query("api_key")String key);
    @GET("search/shows")
    Observable<List<SearchTvs>> getSearchTvs(@Query("q") String word);
}
