package com.example.yuzhilaixiangmu.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.acitivity.JIngxuanbofangMainActivity;
import com.example.yuzhilaixiangmu.adapter.JIngpinAdapter;
import com.example.yuzhilaixiangmu.adapter.JpzhuanjiAdapter;
import com.example.yuzhilaixiangmu.adapter.ShitingAdapter;
import com.example.yuzhilaixiangmu.app.Myimageloader;
import com.example.yuzhilaixiangmu.bean.BannerBeann;
import com.example.yuzhilaixiangmu.bean.JIngpinBean;
import com.example.yuzhilaixiangmu.bean.JpzhuanjiBean;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.bean.ShitingBean;
import com.example.yuzhilaixiangmu.component.DaggerJpzhuanjicomponent;
import com.example.yuzhilaixiangmu.module.Jpzhuanjimodule;
import com.example.yuzhilaixiangmu.presenter.Bannerpresenter;
import com.example.yuzhilaixiangmu.presenter.Jingpinpresenter;
import com.example.yuzhilaixiangmu.presenter.Jpzhuanjipresenter;
import com.example.yuzhilaixiangmu.presenter.Shitingpresenter;
import com.example.yuzhilaixiangmu.view.Bannerview;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;


/**
 * Created by GUO on 2017/12/7.
 */

public class StudyFeagment extends Fragment implements Bannerview {
    private List<String> list = new ArrayList<String>();
    private View view;
    private Banner mBn;
    private RecyclerView mRv;
    private RecyclerView mRvjx;
    @Inject
    Jpzhuanjipresenter jpzhuanjipresenter;
    private RecyclerView mRvzhuanji;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.studyfragment, container, false);
        initView(inflate);
        SharedPreferences user = getActivity().getSharedPreferences("User", Context.MODE_PRIVATE);
        String url = user.getString("url", null);
        String id = user.getString("id", null);
        String key = user.getString("key", null);
        //轮播  关联
        Bannerpresenter bannerpresenter = new Bannerpresenter(this);
        bannerpresenter.Guanlian(url, id, key);
        //试听  关联  列表
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        Shitingpresenter shitingpresenter = new Shitingpresenter(this);
        shitingpresenter.ShitingGuanlian(url, id, key);
        //精选   关联  列表
        mRvjx.setLayoutManager(new LinearLayoutManager(getActivity()));
        Jingpinpresenter jingpinpresenter = new Jingpinpresenter(this);
        jingpinpresenter.JingpinGuanlian(url, id, key);
        //专辑 关联   列表
        mRvzhuanji.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        DaggerJpzhuanjicomponent.builder().jpzhuanjimodule(new Jpzhuanjimodule(this)).build().inject(this);
        jpzhuanjipresenter.JingpinGuanlian(url, id, key);
        return inflate;
    }


    @Override
    public void getBanner(RetBean bannerBeann) {
        BannerBeann beann = (BannerBeann) bannerBeann;
        for (int i = 0; i < beann.getData().getBanner().size(); i++) {
            String image = beann.getData().getBanner().get(i).getImage();
            list.add(image);
        }
        mBn.setImageLoader(new Myimageloader());

        mBn.setImages(list);

        mBn.setDelayTime(2000);
        mBn.start();
    }

    @Override
    public void getShiting(RetBean retBean) {
        ShitingBean shitingBean = (ShitingBean) retBean;
        List<ShitingBean.DataBean.TryBean> tryX = shitingBean.getData().getTryX();
        ShitingAdapter shitingAdapter = new ShitingAdapter(getActivity(), tryX);
        mRv.setAdapter(shitingAdapter);
    }

    @Override
    public void getJingpin(RetBean retBean) {
        JIngpinBean jIngpinBean = (JIngpinBean) retBean;
        List<JIngpinBean.DataBean.CourseBean> course = jIngpinBean.getData().getCourse();
        JIngpinAdapter jIngpinAdapter = new JIngpinAdapter(getActivity(), course);
        mRvjx.setAdapter(jIngpinAdapter);
        jIngpinAdapter.setOncilckjinfxuan(new JIngpinAdapter.Oncilckjinfxuan() {
            @Override
            public void Oncilckjx(JIngpinBean.DataBean.CourseBean jingxuan) {
                Intent intent = new Intent(getActivity(), JIngxuanbofangMainActivity.class);
                intent.putExtra("object_id",jingxuan.getObject_id());
              startActivity(intent);
            }
        });
    }

    @Override
    public void getJpzhuanji(RetBean retBean) {
           JpzhuanjiBean jpzhuanjiBean= (JpzhuanjiBean) retBean;
        List<JpzhuanjiBean.DataBean.TopicBean> topic = jpzhuanjiBean.getData().getTopic();
        JpzhuanjiAdapter jpzhuanjiAdapter = new JpzhuanjiAdapter(getActivity(), topic);
        mRvzhuanji.setAdapter(jpzhuanjiAdapter);
    }

    @Override
    public void getJingpinbofang(RetBean retBean) {

    }

    private void initView(View inflate) {
        mBn = (Banner) inflate.findViewById(R.id.Bn);
        mRv = (RecyclerView) inflate.findViewById(R.id.rv);
        mRvjx = (RecyclerView) inflate.findViewById(R.id.rvjx);
        mRvzhuanji = (RecyclerView) inflate.findViewById(R.id.rvzhuanji);
    }
}
