package com.example.yuzhilaixiangmu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.ShitingBean;

import java.util.List;

/**
 * Created by GUO on 2017/12/10.
 */

public class ShitingAdapter extends RecyclerView.Adapter {
private Context context;
    private List<ShitingBean.DataBean.TryBean> shitingBeen;

    public ShitingAdapter(Context context, List<ShitingBean.DataBean.TryBean> shitingBeen) {
        this.context = context;
        this.shitingBeen = shitingBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shiting, parent, false);
        TypeViewHolder typeViewHolder = new TypeViewHolder(inflate);
        return typeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
   TypeViewHolder typeViewHolder= (TypeViewHolder) holder;
     typeViewHolder.textView.setText(shitingBeen.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return shitingBeen.size();
    }
    private  class TypeViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;

        public TypeViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
