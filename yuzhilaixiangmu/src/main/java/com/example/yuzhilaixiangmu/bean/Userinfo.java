package com.example.yuzhilaixiangmu.bean;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

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

public class Userinfo {
    /**
     * ret : 0
     * data : {"session":"5559936945f96e05efbbf344"}
     */

    private int ret;
    private DataBean data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * session : 5559936945f96e05efbbf344
         */

        private String session;

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }
    }
    private Context context;
    private  String mobile;
    private String s;

    public Userinfo() {
    }

    public Userinfo(Context context) {
        this.context = context;
    }

    public Userinfo(String mobile) {
        this.mobile = mobile;
    }
//点击事件
    public  void  onRegister(String mobile){
        if (TextUtils.isEmpty(mobile)){
            return;
        }
        register(mobile);
    }

    private void register(String mobile) {
        SharedPreferences user = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        String url = user.getString("url", null);
        String id = user.getString("id", null);
        String key = user.getString("key", null);
        long time = new Date().getTime();
        long l = time / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(key);
        stringBuffer.append(id);
        stringBuffer.append("12345");
        stringBuffer.append("1");
        stringBuffer.append(l+"");
        stringBuffer.append(mobile);
        String toString = stringBuffer.toString();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(toString.getBytes());
            String string = new BigInteger(1, bytes).toString(16);
            s = string.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Retrofit retrofit = new RetrofitUtils().getRetrofit(url);
        Apiservce apiservce = retrofit.create(Apiservce.class);
        Flowable<Userinfo> flowable = apiservce.getreg(id, "12345", "1", l + "", mobile, s);
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<Userinfo>() {
                    @Override
                    public void onNext(Userinfo userinfo) {
                        if (onRegisterListener!=null){
                            onRegisterListener.onSuccess(userinfo);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
private  OnRegisterListener onRegisterListener;
    public  interface  OnRegisterListener{
          void  onSuccess(Userinfo regBean);
        void onError(Throwable t);
    }
    public void setOnRegisterListener(OnRegisterListener onRegisterListener){
        this.onRegisterListener = onRegisterListener;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
