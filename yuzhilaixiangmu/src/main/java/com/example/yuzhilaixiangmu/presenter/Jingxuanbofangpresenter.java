package com.example.yuzhilaixiangmu.presenter;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.model.JIngpinbofangmodel;
import com.example.yuzhilaixiangmu.view.Bannerview;

/**
 * Created by GUO on 2017/12/10.
 */

public class Jingxuanbofangpresenter implements Onfinsh {
    Bannerview bannerview;
    private final JIngpinbofangmodel jIngpinbofangmodel;


    public Jingxuanbofangpresenter(Bannerview bannerview) {
    this.bannerview=bannerview;
        jIngpinbofangmodel = new JIngpinbofangmodel();
    }
      public  void  JingpinGuanlian(String url,String id,String key,String object_id){
         jIngpinbofangmodel.getjingxuanbofangModel(this,url,id,key,object_id);
      }

    @Override
    public void Onseccess(RetBean retBean) {

       bannerview.getJingpinbofang(retBean);
    }
}
