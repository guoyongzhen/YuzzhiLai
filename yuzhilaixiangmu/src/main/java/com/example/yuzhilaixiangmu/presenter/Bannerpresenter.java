package com.example.yuzhilaixiangmu.presenter;

import com.example.yuzhilaixiangmu.Onfinsh;
import com.example.yuzhilaixiangmu.bean.RetBean;
import com.example.yuzhilaixiangmu.model.BannerModel;
import com.example.yuzhilaixiangmu.view.Bannerview;

/**
 * Created by GUO on 2017/12/8.
 */

public class Bannerpresenter implements Onfinsh {
    Bannerview bannerview;
    private final BannerModel bannerModel;

    public Bannerpresenter(Bannerview bannerview) {
        this.bannerview=bannerview;
        bannerModel = new BannerModel();
    }
       public  void  Guanlian(String url,String id,String key){
             bannerModel.GetBannerModel(this,url,id,key);
       }

    @Override
    public void Onseccess(RetBean retBean) {
         bannerview.getBanner(retBean);
    }
}
