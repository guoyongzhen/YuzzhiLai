package com.example.yuzhilaixiangmu.acitivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.view.Bannerview;

public class JIngxuanbofangMainActivity extends AppCompatActivity implements Bannerview {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jingxuanbofang_main);
        Intent intent = getIntent();
        String object_id = intent.getStringExtra("object_id");
        SharedPreferences user = getSharedPreferences("User", MODE_PRIVATE);
        //user.getString("")
    }

    @Override
    public void getBanner(RetBean bannerBeann) {

    }

    @Override
    public void getShiting(RetBean retBean) {

    }

    @Override
    public void getJingpin(RetBean retBean) {

    }

    @Override
    public void getJpzhuanji(RetBean retBean) {

    }

    @Override
    public void getJingpinbofang(RetBean retBean) {

    }
}
