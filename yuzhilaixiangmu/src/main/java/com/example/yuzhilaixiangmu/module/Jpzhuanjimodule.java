package com.example.yuzhilaixiangmu.module;

import com.example.yuzhilaixiangmu.view.Bannerview;

import dagger.Module;
import dagger.Provides;

/**
 * Created by GUO on 2017/12/11.
 */
@Module
public class Jpzhuanjimodule {
    //首先实例化
    Bannerview bannerview;
    public Jpzhuanjimodule(Bannerview bannerview) {
        this.bannerview=bannerview;
    }
    //准备
    @Provides
    Bannerview getBannerview(){
        return  bannerview;
    }
}
