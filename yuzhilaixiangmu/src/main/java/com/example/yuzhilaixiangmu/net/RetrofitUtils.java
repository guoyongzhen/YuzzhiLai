package com.example.yuzhilaixiangmu.net;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GUO on 2017/12/7.
 */

public class RetrofitUtils {
    //私有的成员变量，只声明不创建
    private static RetrofitUtils retrofitUtils;
    //私有无参构造
        public RetrofitUtils() {
    }
    //返回静态实例的公共的方法
    public    RetrofitUtils getInstance(){
        if(retrofitUtils==null){
            synchronized (RetrofitUtils.class){
                if(retrofitUtils==null){
                    retrofitUtils=new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }
    //得到Retrofit对象
    private  Retrofit retrofit;
    public  synchronized  Retrofit getRetrofit(String url){
        //添加拦截器
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.i("xxx",message);
            }
        });
        //添加日志级别
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //创建ok
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor)
                .connectTimeout(5000, TimeUnit.SECONDS)
                .readTimeout(5000,TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)
                .build();
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(url).client(okHttpClient).addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();

        }
        return retrofit;

    }
}
