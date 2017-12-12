package com.example.yuzhilaixiangmu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuzhilaixiangmu.R;


/**
 * Created by GUO on 2017/12/7.
 */

public class CourseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.courseframent, container, false);
        return inflate;

    }
}
