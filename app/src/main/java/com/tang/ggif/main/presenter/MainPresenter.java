package com.tang.ggif.main.presenter;

import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;

import java.util.List;

/**
 * Created by tangyc on 2017/4/19.
 */

public interface MainPresenter {
    void startLoad(String word,String key);
    void endLoad(SearchGifes searchGifes);
    void startLoadTvs(String word);
    void endLoad(List<SearchTvs> searchTvse);
    void errorLoad();
    void emptyLoad();
}
