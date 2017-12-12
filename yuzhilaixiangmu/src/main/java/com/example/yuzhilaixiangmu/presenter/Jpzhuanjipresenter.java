package com.example.yuzhilaixiangmu.presenter;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.model.Jpzhuanjimodel;
import com.example.yuzhilaixiangmu.view.Bannerview;

import javax.inject.Inject;

/**
 * Created by GUO on 2017/12/10.
 */

public class Jpzhuanjipresenter implements Onfinsh {
    //注入view   和  model
    @Inject

   Jpzhuanjimodel jpzhuanjimodel;
   private  Bannerview bannerview;

@Inject
    public Jpzhuanjipresenter(Bannerview bannerview) {
    this.bannerview=bannerview;
        jpzhuanjimodel = new Jpzhuanjimodel();
    }
      public  void  JingpinGuanlian(String url,String id,String key){
       jpzhuanjimodel.getjpzhuanjiModel(this,url,id,key);
      }

    @Override
    public void Onseccess(RetBean retBean) {

        bannerview.getJpzhuanji(retBean);
    }
}
