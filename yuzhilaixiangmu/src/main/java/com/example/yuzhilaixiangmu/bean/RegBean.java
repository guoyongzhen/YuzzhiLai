package com.example.yuzhilaixiangmu.bean;

/**
 * Created by GUO on 2017/12/8.
 */

public class RegBean {

    /**
     * ret : 0
     * data : {"session":"5559936945f96e05efbbf344"}
     */

    private int ret;
    private DataBean data;

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
         * session : 5559936945f96e05efbbf344
         */

        private String session;

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }
    }
}
