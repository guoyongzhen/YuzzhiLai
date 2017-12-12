package com.example.yuzhilaixiangmu.net;

import com.example.yuzhilaixiangmu.bean.BannerBeann;
import com.example.yuzhilaixiangmu.bean.FirstBean;
import com.example.yuzhilaixiangmu.bean.HostBean;
import com.example.yuzhilaixiangmu.bean.JIngpinBean;
import com.example.yuzhilaixiangmu.bean.JpzhuanjiBean;
import com.example.yuzhilaixiangmu.bean.ShitingBean;
import com.example.yuzhilaixiangmu.bean.Userinfo;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by GUO on 2017/12/7.
 */

public interface Apiservce {
        //一次握手
@POST("/app/v1/first_hand")
        @FormUrlEncoded
Flowable<FirstBean> getfirst(@Field("type") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("sign") String sign);
//二次握手
        @POST("/app/v1/get_host")
        @FormUrlEncoded
        Flowable<HostBean> gethost(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("sign") String sign);
//轮播
        @POST("/app/v1/list_banner")
        @FormUrlEncoded
        Flowable<BannerBeann> getbanner(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("sign") String sign);
//试听
        @POST("/app/v1/list_try")
        @FormUrlEncoded
        Flowable<ShitingBean> getshiting(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick,@Field("page_size") String page_size,@Field("page_index") String page_index,@Field("sign") String sign);
//精品
@POST("/app/v1/list_course")
@FormUrlEncoded
Flowable<JIngpinBean> getjingoin(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("page_size") String page_size, @Field("page_index") String page_index, @Field("sort_by") String sort_by, @Field("sign") String sign);
//专辑
        @POST("/app/v1/list_topic")
        @FormUrlEncoded
        Flowable<JpzhuanjiBean> getjpzhuanji(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("page_size") String page_size, @Field("page_index") String page_index, @Field("sign") String sign);
        //精选播放
        @POST("/app/v1/detail_course")
        @FormUrlEncoded
        Flowable<JpzhuanjiBean> getjingxuanbofang(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("object_id") String object_id, @Field("sign") String sign);



        @POST("/app/v1/user_reg")
        @FormUrlEncoded
        Flowable<Userinfo> getreg(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("mobile") String mobile, @Field("sign") String sign);
}
