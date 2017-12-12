package com.example.yuzhilaixiangmu.bean;

import java.util.List;

/**
 * Created by GUO on 2017/12/8.
 */

public class JpzhuanjiBean extends  RetBean {

    /**
     * data : {"topic":[{"title":"学习改变店务","image":"https://pretty.f8cam.com/static/image/product/yk/ykwysrihli.jpg","title2":"科学高效的干    ","object_id":"20000030","length":7,"type":1},{"title":"快速引爆新客","image":"https://pretty.f8cam.com/static/image/product/fz/fznbvyhfkn.jpg","title2":"","object_id":"20000054","length":1,"type":2},{"title":"创新预知未来","image":"https://pretty.f8cam.com/static/image/product/jx/jxegkaptca.jpg","title2":"","object_id":"20000031","length":0,"type":2},{"title":"店务系统学","image":"https://pretty.f8cam.com/static/image/product/je/jeleafexbp.jpg","title2":"","object_id":"20000037","length":0,"type":2},{"title":"专业成就未来","image":"https://pretty.f8cam.com/static/image/product/fl/flnnolhver.jpg","title2":"专业成就未来","object_id":"20000059","length":0,"type":2},{"title":"竞争赢得市场","image":"https://pretty.f8cam.com/static/image/product/tj/tjvhidyfhe.jpg","title2":"","object_id":"20000058","length":0,"type":2}],"page_index":"0","total":6,"page_size":"10"}
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
         * topic : [{"title":"学习改变店务","image":"https://pretty.f8cam.com/static/image/product/yk/ykwysrihli.jpg","title2":"科学高效的干    ","object_id":"20000030","length":7,"type":1},{"title":"快速引爆新客","image":"https://pretty.f8cam.com/static/image/product/fz/fznbvyhfkn.jpg","title2":"","object_id":"20000054","length":1,"type":2},{"title":"创新预知未来","image":"https://pretty.f8cam.com/static/image/product/jx/jxegkaptca.jpg","title2":"","object_id":"20000031","length":0,"type":2},{"title":"店务系统学","image":"https://pretty.f8cam.com/static/image/product/je/jeleafexbp.jpg","title2":"","object_id":"20000037","length":0,"type":2},{"title":"专业成就未来","image":"https://pretty.f8cam.com/static/image/product/fl/flnnolhver.jpg","title2":"专业成就未来","object_id":"20000059","length":0,"type":2},{"title":"竞争赢得市场","image":"https://pretty.f8cam.com/static/image/product/tj/tjvhidyfhe.jpg","title2":"","object_id":"20000058","length":0,"type":2}]
         * page_index : 0
         * total : 6
         * page_size : 10
         */

        private String page_index;
        private int total;
        private String page_size;
        private List<TopicBean> topic;

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

        public List<TopicBean> getTopic() {
            return topic;
        }

        public void setTopic(List<TopicBean> topic) {
            this.topic = topic;
        }

        public static class TopicBean {
            /**
             * title : 学习改变店务
             * image : https://pretty.f8cam.com/static/image/product/yk/ykwysrihli.jpg
             * title2 : 科学高效的干
             * object_id : 20000030
             * length : 7
             * type : 1
             */

            private String title;
            private String image;
            private String title2;
            private String object_id;
            private int length;
            private int type;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle2() {
                return title2;
            }

            public void setTitle2(String title2) {
                this.title2 = title2;
            }

            public String getObject_id() {
                return object_id;
            }

            public void setObject_id(String object_id) {
                this.object_id = object_id;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
