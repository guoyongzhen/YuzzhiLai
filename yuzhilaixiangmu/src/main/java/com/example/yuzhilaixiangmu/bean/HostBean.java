package com.example.yuzhilaixiangmu.bean;

/**
 * Created by GUO on 2017/12/7.
 */

public class HostBean {

    /**
     * ret : 0
     * data : {"url_host":"https://app.pretty.f8cam.com:17211"}
     */

    public int ret;
    public DataBean data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * url_host : https://app.pretty.f8cam.com:17211
         */

        private String url_host;

        public String getUrl_host() {
            return url_host;
        }

        public void setUrl_host(String url_host) {
            this.url_host = url_host;
        }
    }
}
