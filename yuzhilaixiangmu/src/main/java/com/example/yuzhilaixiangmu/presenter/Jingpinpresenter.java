package com.example.yuzhilaixiangmu.presenter;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.model.JIngpinmodel;
import com.example.yuzhilaixiangmu.view.Bannerview;

/**
 * Created by GUO on 2017/12/10.
 */

public class Jingpinpresenter implements Onfinsh {
    Bannerview bannerview;
    private final JIngpinmodel jIngpinmodel;


    public Jingpinpresenter(Bannerview bannerview) {
    this.bannerview=bannerview;
        jIngpinmodel = new JIngpinmodel();
    }
      public  void  JingpinGuanlian(String url,String id,String key){
          jIngpinmodel.getjingpinModel(this,url,id,key);
      }

    @Override
    public void Onseccess(RetBean retBean) {

        bannerview.getJingpin(retBean);
    }
}
