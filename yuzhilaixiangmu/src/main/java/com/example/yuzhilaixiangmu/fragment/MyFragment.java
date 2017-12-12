package com.example.yuzhilaixiangmu.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.yuzhilaixiangmu.R;
import com.example.yuzhilaixiangmu.acitivity.RegActivity;


/**
 * Created by GUO on 2017/12/7.
 */

public class MyFragment extends Fragment implements View.OnClickListener {
    private View view;
    /**
     * 登录
     */
    private Button mBuLogin;
    /**
     * 快速注册
     */
    private Button mBuReg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.myfragment, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        mBuLogin = (Button) inflate.findViewById(R.id.bu_login);
        mBuLogin.setOnClickListener(this);
        mBuReg = (Button) inflate.findViewById(R.id.bu_reg);
        mBuReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bu_login:
                break;
            case R.id.bu_reg:
                Intent intent = new Intent(getActivity(), RegActivity.class);
                startActivity(intent);
                break;
        }
    }
}
