package com.example.yuzhilaixiangmu.acitivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.FirstBean;
import com.example.yuzhilaixiangmu.bean.HostBean;
import com.example.yuzhilaixiangmu.fragment.CourseFragment;
import com.example.yuzhilaixiangmu.fragment.MyFragment;
import com.example.yuzhilaixiangmu.fragment.StudyFeagment;
import com.example.yuzhilaixiangmu.net.Api;
import com.example.yuzhilaixiangmu.net.Apiservce;
import com.example.yuzhilaixiangmu.net.RetrofitUtils;
import com.hjm.bottomtabbar.BottomTabBar;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DefaultSubscriber;
import retrofit2.Retrofit;

public class MainActivityyuzhilaixiamgmu extends AppCompatActivity {
    private BottomTabBar mb;
    private  String s;

    private String app_id;
    private String private_key;
    private String hostt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityyuzhilaixiamgmu);
        mb=(BottomTabBar)findViewById(R.id.bottom_tab_bar);

        mb.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.BLUE,Color.DKGRAY)
                .addTabItem("学习",R.mipmap.commonstudyselected,R.mipmap.commonstudyunselected, StudyFeagment.class)
                .addTabItem("课程",R.mipmap.commoncourseselected,R.mipmap.commoncourseunselected, CourseFragment.class)
                .addTabItem("我的",R.mipmap.commonmineselected,R.mipmap.commonmineunselected, MyFragment.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

        long time = new Date().getTime();
        long l = time / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("312045ED9D036BEED16E96F3878E222ED7E58AC9");
        stringBuffer.append("ANDROID");
        stringBuffer.append("12345");
        stringBuffer.append("1");
        stringBuffer.append(l+"");
        String toString = stringBuffer.toString();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(toString.getBytes());
            //消息摘要的结果一般都是转换成16 进制字符串形式展示
            String string = new BigInteger(1, bytes).toString(16);
            //转成大写
            s = string.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Retrofit retrofit = new RetrofitUtils().getRetrofit(Api.FIRST);
        //动态代理实现Apiservce
        Apiservce apiservce = retrofit.create(Apiservce.class);
        Flowable<FirstBean> flowable = apiservce.getfirst("ANDROID", "12345", "1", l + "", s);
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<FirstBean>() {
                    @Override
                    public void onNext(FirstBean firstBean) {
                        app_id = firstBean.getData().getApp_id();
                        private_key = firstBean.getData().getPrivate_key();
                        Log.e("id",app_id);
                        Log.e("key",private_key);
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                        Host();
                    }
                });

    }

    private void Host() {

        long time = new Date().getTime();
        long l = time / 1000;
        Log.e("ll",l+"");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(private_key);
        stringBuffer.append(app_id);
        stringBuffer.append("12345");
        stringBuffer.append("1");
        stringBuffer.append(l+"");
        String toString = stringBuffer.toString();
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(toString.getBytes());
            //消息摘要的结果一般都是转换成16 进制字符串形式展示
            String string = new BigInteger(1, bytes).toString(16);
            //转成大写
            hostt = string.toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Retrofit retrofit = new RetrofitUtils().getRetrofit(Api.FIRST);
        //动态代理实现Apiservce
        Apiservce apiservce = retrofit.create(Apiservce.class);
        Flowable<HostBean> gethost = apiservce.gethost(app_id, "12345", "1", l+ "", hostt);
        gethost.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DefaultSubscriber<HostBean>() {
                    @Override
                    public void onNext(HostBean firstBean) {
                        String url_host = firstBean.data.getUrl_host();
                        SharedPreferences user = getSharedPreferences("User", MODE_PRIVATE);
                        SharedPreferences.Editor edit = user.edit();
                        edit.putString("id",app_id);
                        edit.putString("key",private_key);
                        edit.putString("url",url_host);
                        edit.commit();
                        //Log.e("app1",url_host);
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
