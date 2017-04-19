package com.tang.ggif.search;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.tang.ggif.R;
import com.tang.ggif.adapter.TVAdapter;
import com.tang.ggif.beans.SearchGifes;
import com.tang.ggif.beans.SearchTvs;
import com.tang.ggif.main.presenter.IMainPresenter;
import com.tang.ggif.main.view.MainView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends AppCompatActivity implements MainView, TVAdapter.onItemClickListener {

    @BindView(R.id.rv_search)
    RecyclerView mRvSearch;
    @BindView(R.id.iv_empty)
    ImageView mIvEmpty;
    private IMainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        mRvSearch.setLayoutManager(gridLayoutManager);
        mIvEmpty.setVisibility(View.GONE);
        initData();
    }

    private void initData() {
        String searchContent = getIntent().getStringExtra(SearchManager.QUERY);
        presenter = new IMainPresenter(this);
        presenter.startLoadTvs(searchContent);
        mRvSearch.setVisibility(View.VISIBLE);
    }

    @Override
    public void startLoad() {
    }

    @Override
    public void endLoad(SearchGifes searchGifes) {
    }

    @Override
    public void endLoad(List<SearchTvs> searchTvses) {
        TVAdapter adapter = new TVAdapter(SearchActivity.this, searchTvses);
        adapter.setListener(this);
        mRvSearch.setAdapter(adapter);
    }

    @Override
    public void errorLoad() {
    }

    @Override
    public void emptyLoad() {
        mIvEmpty.setVisibility(View.VISIBLE);
        mRvSearch.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        Snackbar.make(v,"点击了一下",Snackbar.LENGTH_LONG).show();
    }
}
