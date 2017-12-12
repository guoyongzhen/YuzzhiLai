package com.example.yuzhilaixiangmu.bean;

import java.util.List;

/**
 * Created by GUO on 2017/12/8.
 */

public class BannerBeann extends  RetBean{

    /**
     * data : {"banner":[{"image":"https://pretty.f8cam.com/static/image/product/ul/ulypzyozft.png","click":""},{"image":"https://pretty.f8cam.com/static/image/product/nd/ndpdvuwudo.png","click":""},{"image":"https://pretty.f8cam.com/static/image/product/fx/fxxbkqhqzt.png","click":""}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<BannerBean> banner;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public static class BannerBean {
            /**
             * image : https://pretty.f8cam.com/static/image/product/ul/ulypzyozft.png
             * click :
             */

            private String image;
            private String click;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getClick() {
                return click;
            }

            public void setClick(String click) {
                this.click = click;
            }
        }
    }
}
