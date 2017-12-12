package com.example.yuzhilaixiangmu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.JIngxuanbofangBean;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by GUO on 2017/12/10.
 */

public class JIngpinbofangAdapter extends RecyclerView.Adapter {
private Context context;
    private List<JIngxuanbofangBean.DataBean> shitingBeen;


    public JIngpinbofangAdapter(Context context, List<JIngxuanbofangBean.DataBean> shitingBeen) {
        this.context = context;
        this.shitingBeen = shitingBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.jingxuanbofang, parent, false);
        TypeViewHolder typeViewHolder = new TypeViewHolder(inflate);
        return typeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
   TypeViewHolder typeViewHolder= (TypeViewHolder) holder;
        String course_video = shitingBeen.get(position).getCourse_video();
        typeViewHolder.jcVideoPlayerStandard.setUp(course_video,typeViewHolder.jcVideoPlayerStandard.SCREEN_LAYOUT_NORMAL,shitingBeen.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return shitingBeen.size();
    }
    private  class TypeViewHolder extends RecyclerView.ViewHolder{


        private final JCVideoPlayerStandard jcVideoPlayerStandard;

        public TypeViewHolder(View itemView) {
            super(itemView);
            jcVideoPlayerStandard = itemView.findViewById(R.id.jiecao_Player);

        }
    }
}
