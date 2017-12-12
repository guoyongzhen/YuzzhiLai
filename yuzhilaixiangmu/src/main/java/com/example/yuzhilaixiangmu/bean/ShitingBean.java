package com.example.yuzhilaixiangmu.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by GUO on 2017/12/8.
 */

public class ShitingBean extends  RetBean {

    /**
     * data : {"try":[{"title2":"店务健康系统","speaker":"策划人：高铭均","title":"店务11大数据","try_time":60,"image":"https://pretty.f8cam.com/static/image/product/rs/rsxgwflhnr.jpeg","type":1,"length":1116,"object_id":"10000045"},{"title2":"轻模式  快效果","speaker":"策划人：高铭均","title":"轻奢卡引爆C客（一）","try_time":480,"image":"https://pretty.f8cam.com/static/image/product/xa/xaxfubevhc.jpg","type":2,"length":480,"object_id":"10000078"},{"title2":"轻模式  快效果","speaker":"策划人：高铭均","title":"轻奢卡引爆C客（二）","try_time":487,"image":"https://pretty.f8cam.com/static/image/product/sd/sdgawsznji.jpg","type":2,"length":487,"object_id":"10000079"},{"title2":"零成本 快速引爆利润","speaker":"潘柳倩","title":"销售的本质","try_time":255,"image":"https://pretty.f8cam.com/static/image/product/zh/zhfxinafdu.jpg","type":2,"length":255,"object_id":"10000074"},{"title2":"零成本 快速引爆利润","speaker":"潘柳倩","title":"营销的本质","try_time":336,"image":"https://pretty.f8cam.com/static/image/product/dp/dpiriqtryv.jpg","type":2,"length":336,"object_id":"10000075"}],"page_index":"0","total":5,"page_size":"10"}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * try : [{"title2":"店务健康系统","speaker":"策划人：高铭均","title":"店务11大数据","try_time":60,"image":"https://pretty.f8cam.com/static/image/product/rs/rsxgwflhnr.jpeg","type":1,"length":1116,"object_id":"10000045"},{"title2":"轻模式  快效果","speaker":"策划人：高铭均","title":"轻奢卡引爆C客（一）","try_time":480,"image":"https://pretty.f8cam.com/static/image/product/xa/xaxfubevhc.jpg","type":2,"length":480,"object_id":"10000078"},{"title2":"轻模式  快效果","speaker":"策划人：高铭均","title":"轻奢卡引爆C客（二）","try_time":487,"image":"https://pretty.f8cam.com/static/image/product/sd/sdgawsznji.jpg","type":2,"length":487,"object_id":"10000079"},{"title2":"零成本 快速引爆利润","speaker":"潘柳倩","title":"销售的本质","try_time":255,"image":"https://pretty.f8cam.com/static/image/product/zh/zhfxinafdu.jpg","type":2,"length":255,"object_id":"10000074"},{"title2":"零成本 快速引爆利润","speaker":"潘柳倩","title":"营销的本质","try_time":336,"image":"https://pretty.f8cam.com/static/image/product/dp/dpiriqtryv.jpg","type":2,"length":336,"object_id":"10000075"}]
         * page_index : 0
         * total : 5
         * page_size : 10
         */

        private String page_index;
        private int total;
        private String page_size;
        @SerializedName("try")
        private List<TryBean> tryX;

        public String getPage_index() {
            return page_index;
        }

        public void setPage_index(String page_index) {
            this.page_index = page_index;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public String getPage_size() {
            return page_size;
        }

        public void setPage_size(String page_size) {
            this.page_size = page_size;
        }

        public List<TryBean> getTryX() {
            return tryX;
        }

        public void setTryX(List<TryBean> tryX) {
            this.tryX = tryX;
        }

        public static class TryBean {
            /**
             * title2 : 店务健康系统
             * speaker : 策划人：高铭均
             * title : 店务11大数据
             * try_time : 60
             * image : https://pretty.f8cam.com/static/image/product/rs/rsxgwflhnr.jpeg
             * type : 1
             * length : 1116
             * object_id : 10000045
             */

            private String title2;
            private String speaker;
            private String title;
            private int try_time;
            private String image;
            private int type;
            private int length;
            private String object_id;

            public String getTitle2() {
                return title2;
            }

            public void setTitle2(String title2) {
                this.title2 = title2;
            }

            public String getSpeaker() {
                return speaker;
            }

            public void setSpeaker(String speaker) {
                this.speaker = speaker;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getTry_time() {
                return try_time;
            }

            public void setTry_time(int try_time) {
                this.try_time = try_time;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public String getObject_id() {
                return object_id;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }
        }
    }
}
