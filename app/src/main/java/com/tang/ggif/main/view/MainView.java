package com.tang.ggif.main.view;

import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;

import java.util.List;

/**
 * Created by tangyc on 2017/4/19.
 */

public interface MainView {
    void startLoad();
    void endLoad(SearchGifes searchGifes);
    void endLoad(List<SearchTvs> searchTvses);
    void errorLoad();
    void emptyLoad();
}
