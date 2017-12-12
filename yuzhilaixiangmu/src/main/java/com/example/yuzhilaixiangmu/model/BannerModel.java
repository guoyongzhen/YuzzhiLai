package com.example.yuzhilaixiangmu.model;

import android.content.Context;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.BannerBeann;
import com.example.yuzhilaixiangmu.net.Apiservce;
import com.example.yuzhilaixiangmu.net.RetrofitUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import retrofit2.Retrofit;

/**
 * Created by GUO on 2017/12/8.
 */

public class BannerModel {
    private  String s;
    private Context context;
          public  void  GetBannerModel(final Onfinsh onfinsh,String url,String id,String key){
              long time = new Date().getTime();
              long l = time / 1000;
              Retrofit retrofit = new RetrofitUtils().getRetrofit(url);
              Apiservce apiservce = retrofit.create(Apiservce.class);
              StringBuffer stringBuffer = new StringBuffer();
              stringBuffer.append(key);
              stringBuffer.append(id);
              stringBuffer.append("12345");
              stringBuffer.append("1");
              stringBuffer.append(l+"");
            //  stringBuffer.append(mobile);
              String toString = stringBuffer.toString();
              try {
                  MessageDigest digest = MessageDigest.getInstance("MD5");
                  byte[] bytes = digest.digest(toString.getBytes());
                  String string = new BigInteger(1, bytes).toString(16);
                  s = string.toUpperCase();
              } catch (NoSuchAlgorithmException e) {
                  e.printStackTrace();
              }
              Flowable<BannerBeann> flowable = apiservce.getbanner(id, "12345", "1", l + "", s);
              flowable.subscribeOn(Schedulers.io())
                      .observeOn(AndroidSchedulers.mainThread())
                      .subscribeWith(new DisposableSubscriber<BannerBeann>() {
                          @Override
                          public void onNext(BannerBeann bannerBeann) {
                              onfinsh.Onseccess(bannerBeann);
                          }

                          @Override
                          public void onError(Throwable t) {

                          }

                          @Override
                          public void onComplete() {

                          }
                      });
          }
}
