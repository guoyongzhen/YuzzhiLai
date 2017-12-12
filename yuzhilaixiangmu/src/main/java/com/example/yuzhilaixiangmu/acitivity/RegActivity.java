package com.example.yuzhilaixiangmu.acitivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* ActivityRegBinding regBinding = DataBindingUtil.setContentView(RegActivity.this, R.layout.activity_reg);
        Userinfo userinfo = new Userinfo();
        regBinding.setUserinfo(userinfo);
       userinfo.setOnRegisterListener(new Userinfo.OnRegisterListener() {
           @Override
           public void onSuccess(Userinfo regBean) {
               String session = regBean.getData().getSession();
               Toast.makeText(RegActivity.this,session,Toast.LENGTH_LONG).show();
           }

           @Override
           public void onError(Throwable t) {

           }
       });*/
    }
}
