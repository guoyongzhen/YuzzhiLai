package com.example.yuzhilaixiangmu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.JIngpinBean;

import java.util.List;

/**
 * Created by GUO on 2017/12/10.
 */

public class JIngpinAdapter extends RecyclerView.Adapter {
private Context context;
    private List<JIngpinBean.DataBean.CourseBean> shitingBeen;
private  Oncilckjinfxuan oncilckjinfxuan;
    public  interface  Oncilckjinfxuan{
        void  Oncilckjx(JIngpinBean.DataBean.CourseBean jingxuan);
    }
    public  void  setOncilckjinfxuan(Oncilckjinfxuan oncilckjinfxuan){
        this.oncilckjinfxuan=oncilckjinfxuan;
    }

    public JIngpinAdapter(Context context, List<JIngpinBean.DataBean.CourseBean> shitingBeen) {
        this.context = context;
        this.shitingBeen = shitingBeen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.jingpin, parent, false);
        TypeViewHolder typeViewHolder = new TypeViewHolder(inflate);
        return typeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
   TypeViewHolder typeViewHolder= (TypeViewHolder) holder;
        String image = shitingBeen.get(position).getImage();
        Glide.with(context).load(image).into(typeViewHolder.imageView);
        typeViewHolder.tv_title.setText(shitingBeen.get(position).getTitle());
        typeViewHolder.tv_title2.setText(shitingBeen.get(position).getTitle2());
        typeViewHolder.speaker.setText(shitingBeen.get(position).getSpeaker());
        typeViewHolder.price.setText("¥"+shitingBeen.get(position).getPrice());
        typeViewHolder.volume.setText("已售"+shitingBeen.get(position).getVolume());
        typeViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oncilckjinfxuan!=null){
                    oncilckjinfxuan.Oncilckjx(shitingBeen.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return shitingBeen.size();
    }
    private  class TypeViewHolder extends RecyclerView.ViewHolder{


        private final ImageView imageView;
        private final LinearLayout linearLayout;
        private final TextView tv_title;
        private final TextView tv_title2;
        private final TextView speaker;
        private final TextView price;
        private final TextView volume;

        public TypeViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            linearLayout = itemView.findViewById(R.id.ll);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_title2 = itemView.findViewById(R.id.tv_title2);
            speaker = itemView.findViewById(R.id.speaker);
            price = itemView.findViewById(R.id.price);
            volume = itemView.findViewById(R.id.volume);
        }
    }
}
