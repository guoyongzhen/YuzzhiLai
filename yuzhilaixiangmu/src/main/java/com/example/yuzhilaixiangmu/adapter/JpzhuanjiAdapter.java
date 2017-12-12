package com.example.yuzhilaixiangmu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.JpzhuanjiBean;

import java.util.List;

/**
 * Created by GUO on 2017/12/10.
 */

public class JpzhuanjiAdapter extends RecyclerView.Adapter {
private Context context;
    private List<JpzhuanjiBean.DataBean.TopicBean> shitingBeen;

    public JpzhuanjiAdapter(Context context, List<JpzhuanjiBean.DataBean.TopicBean> shitingBeen) {
        this.context = context;
        this.shitingBeen = shitingBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.jxzhuanji, parent, false);
        TypeViewHolder typeViewHolder = new TypeViewHolder(inflate);
        return typeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
   TypeViewHolder typeViewHolder= (TypeViewHolder) holder;
        String image = shitingBeen.get(position).getImage();
        Glide.with(context).load(image).into(typeViewHolder.imageView);
        typeViewHolder.textView.setText(shitingBeen.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return shitingBeen.size();
    }
    private  class TypeViewHolder extends RecyclerView.ViewHolder{


        private final ImageView imageView;
        private final TextView textView;

        public TypeViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
