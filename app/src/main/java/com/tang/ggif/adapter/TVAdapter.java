package com.tang.ggif.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.tang.ggif.R;
import com.tang.ggif.beans.SearchTvs;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tangyc on 2017/4/19.
 */

public class TVAdapter extends RecyclerView.Adapter<TVAdapter.GifViewHolder> {


    private Context context;
    private List<SearchTvs> searchTvses;
    private onItemClickListener listener;




    public TVAdapter(Context context, List<SearchTvs> searchTvses) {
        this.context = context;
        this.searchTvses = searchTvses;
    }

    @Override
    public GifViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_tv, null);
        return new GifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GifViewHolder holder, int position) {
        if (searchTvses.get(position).getShow().getImage() != null) {
            String url = searchTvses.get(position).getShow().getImage().getOriginal();
            Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.SOURCE).placeholder(R.mipmap.ic_empty).into(holder.mIvTV);
        } else {
            holder.mIvTV.setImageResource(R.mipmap.ic_empty);
        }
        String name = searchTvses.get(position).getShow().getName();
        holder.mTvName.setText(name);
        String language = searchTvses.get(position).getShow().getLanguage();
        holder.mTvLanguage.setText(language);
        String premiered = searchTvses.get(position).getShow().getPremiered();
        holder.mTvPremiered.setText(premiered);

    }

    @Override
    public int getItemCount() {
        return searchTvses.size();
    }

    class GifViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.iv_tv)
        ImageView mIvTV;
        @BindView(R.id.tv_name)
        TextView mTvName;
        @BindView(R.id.tv_language)
        TextView mTvLanguage;
        @BindView(R.id.tv_premiered)
        TextView mTvPremiered;
        public GifViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            //mIvGif= (ImageView) itemView.findViewById(R.id.iv_tv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener!=null)
                listener.onClick(v);
        }
    }
    public void setListener(onItemClickListener listener) {
        this.listener = listener;
    }
    public  interface  onItemClickListener{
        void onClick(View v);
    }


}
