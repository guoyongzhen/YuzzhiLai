package com.example.yuzhilaixiangmu.component;

import com.example.yuzhilaixiangmu.fragment.StudyFeagment;
import com.example.yuzhilaixiangmu.module.Jpzhuanjimodule;

import dagger.Component;

/**
 * Created by GUO on 2017/12/11.
 */
@Component(modules = Jpzhuanjimodule.class)
public interface Jpzhuanjicomponent {
//注入调用者
    void  inject(StudyFeagment studyFeagment);
}
