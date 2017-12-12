package com.example.yuzhilaixiangmu.model;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.JpzhuanjiBean;
import com.example.yuzhilaixiangmu.net.Apiservce;
import com.example.yuzhilaixiangmu.net.RetrofitUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import retrofit2.Retrofit;

/**
 * Created by GUO on 2017/12/10.
 */

public class Jpzhuanjimodel {
    //注入
    @Inject
    public Jpzhuanjimodel() {
    }

    private String upperCase;

    public  void  getjpzhuanjiModel(final Onfinsh onfinsh, String url, String id, String key){
        long time = new Date().getTime();
        long l = time / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(key);
        stringBuffer.append(id);
        stringBuffer.append("12345");
        stringBuffer.append("1");
        stringBuffer.append(l+"");
        stringBuffer.append("10");
        stringBuffer.append("0");
        final String s = stringBuffer.toString();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(s.getBytes());
            String s1 = new BigInteger(1, bytes).toString(16);
            upperCase = s1.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Retrofit retrofit = new RetrofitUtils().getRetrofit(url);
        //通过动态代理
        Apiservce apiservce = retrofit.create(Apiservce.class);
        Flowable<JpzhuanjiBean> flowable = apiservce.getjpzhuanji(id, "12345", "1", l + "", "10", "0", upperCase);
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
               .subscribeWith(new DisposableSubscriber<JpzhuanjiBean>() {
                   @Override
                   public void onNext(JpzhuanjiBean jpzhuanjiBean) {
                       onfinsh.Onseccess(jpzhuanjiBean);
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
