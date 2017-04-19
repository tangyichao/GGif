package com.tang.ggif.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.tang.ggif.R;
import com.tang.ggif.beans.SearchGifes;

import java.util.List;

/**
 * Created by tangyc on 2017/4/19.
 */

public class GifAdapter extends RecyclerView.Adapter<GifAdapter.GifViewHolder> {

    private Context context;
    private List<SearchGifes.DataBean> datas;
    public GifAdapter(Context context, SearchGifes searchGifes) {
        this.context = context;
        datas=searchGifes.getData();
    }

    @Override
    public GifViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_gif, null);
        return new GifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GifViewHolder holder, int position) {
       String gifUrl= datas.get(position).getImages().getFixed_height().getUrl();
        Log.i("TAG",gifUrl);
        Glide.with(context).load(gifUrl).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(new GlideDrawableImageViewTarget(holder.mIvGif,1));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class GifViewHolder extends RecyclerView.ViewHolder {
       // @BindView(R.id.iv_gif)
        ImageView mIvGif;
        public GifViewHolder(View itemView) {
            super(itemView);
           // ButterKnife.bind(this, itemView);
           mIvGif= (ImageView) itemView.findViewById(R.id.iv_gif);
        }
    }
}
