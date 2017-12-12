package com.example.yuzhilaixiangmu.bean;

/**
 * Created by GUO on 2017/12/7.
 */

public class FirstBean {

    /**
     * data : {"private_key":"1A09660C31E8B568F3F9A7B1EA2F7C58D1D36CAC","app_id":"5S54EZ2Y"}
     * ret : 0
     */

    private DataBean data;
    private int ret;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public static class DataBean {
        /**
         * private_key : 1A09660C31E8B568F3F9A7B1EA2F7C58D1D36CAC
         * app_id : 5S54EZ2Y
         */

        private String private_key;
        private String app_id;

        public String getPrivate_key() {
            return private_key;
        }

        public void setPrivate_key(String private_key) {
            this.private_key = private_key;
        }

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }
    }
}
