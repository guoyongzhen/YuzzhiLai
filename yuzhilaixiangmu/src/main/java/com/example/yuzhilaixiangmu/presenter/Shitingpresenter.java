package com.example.yuzhilaixiangmu.presenter;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.model.Shitingmodel;
import com.example.yuzhilaixiangmu.view.Bannerview;

/**
 * Created by GUO on 2017/12/10.
 */

public class Shitingpresenter implements Onfinsh {
    Bannerview bannerview;
    private final Shitingmodel shitingmodel;

    public Shitingpresenter(Bannerview bannerview) {
    this.bannerview=bannerview;
        shitingmodel = new Shitingmodel();
    }
      public  void  ShitingGuanlian(String url,String id,String key){
        shitingmodel.getshitingModel(this,url,id,key);
      }

    @Override
    public void Onseccess(RetBean retBean) {
        bannerview.getShiting(retBean);
    }
}
