package com.example.yuzhilaixiangmu.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by GUO on 2017/12/11.
 */

public class JIngxuanbofangBean extends  RetBean {

    /**
     * data : {"exam_score":-1,"have_exam":0,"title":"店务11大数据","speaker_head":"https://pretty.f8cam.com/static/image/product/bm/bmyzjpjddn.jpeg","comment_num":1,"abstract":"","service_tel":"0571\u201486092821","object_id":"10000045","speaker_position":"","volume":10,"try_length":60,"title2":"店务健康系统","course_video":"https://pretty.f8cam.com/static/image/transcoded_files/20170706/20170706144327.mp4","speaker":"策划人：高铭均","is_free":0,"image":"https://pretty.f8cam.com/static/image/product/rs/rsxgwflhnr.jpeg","is_heart":0,"speaker_audio":"https://pretty.f8cam.com/static/image/media_upload/20170627/zgmruylyfa.mp3","type":1,"price":150}
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
         * exam_score : -1
         * have_exam : 0
         * title : 店务11大数据
         * speaker_head : https://pretty.f8cam.com/static/image/product/bm/bmyzjpjddn.jpeg
         * comment_num : 1
         * abstract :
         * service_tel : 0571—86092821
         * object_id : 10000045
         * speaker_position :
         * volume : 10
         * try_length : 60
         * title2 : 店务健康系统
         * course_video : https://pretty.f8cam.com/static/image/transcoded_files/20170706/20170706144327.mp4
         * speaker : 策划人：高铭均
         * is_free : 0
         * image : https://pretty.f8cam.com/static/image/product/rs/rsxgwflhnr.jpeg
         * is_heart : 0
         * speaker_audio : https://pretty.f8cam.com/static/image/media_upload/20170627/zgmruylyfa.mp3
         * type : 1
         * price : 150
         */

        private int exam_score;
        private int have_exam;
        private String title;
        private String speaker_head;
        private int comment_num;
        @SerializedName("abstract")
        private String abstractX;
        private String service_tel;
        private String object_id;
        private String speaker_position;
        private int volume;
        private int try_length;
        private String title2;
        private String course_video;
        private String speaker;
        private int is_free;
        private String image;
        private int is_heart;
        private String speaker_audio;
        private int type;
        private int price;

        public int getExam_score() {
            return exam_score;
        }

        public void setExam_score(int exam_score) {
            this.exam_score = exam_score;
        }

        public int getHave_exam() {
            return have_exam;
        }

        public void setHave_exam(int have_exam) {
            this.have_exam = have_exam;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSpeaker_head() {
            return speaker_head;
        }

        public void setSpeaker_head(String speaker_head) {
            this.speaker_head = speaker_head;
        }

        public int getComment_num() {
            return comment_num;
        }

        public void setComment_num(int comment_num) {
            this.comment_num = comment_num;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getService_tel() {
            return service_tel;
        }

        public void setService_tel(String service_tel) {
            this.service_tel = service_tel;
        }

        public String getObject_id() {
            return object_id;
        }

        public void setObject_id(String object_id) {
            this.object_id = object_id;
        }

        public String getSpeaker_position() {
            return speaker_position;
        }

        public void setSpeaker_position(String speaker_position) {
            this.speaker_position = speaker_position;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getTry_length() {
            return try_length;
        }

        public void setTry_length(int try_length) {
            this.try_length = try_length;
        }

        public String getTitle2() {
            return title2;
        }

        public void setTitle2(String title2) {
            this.title2 = title2;
        }

        public String getCourse_video() {
            return course_video;
        }

        public void setCourse_video(String course_video) {
            this.course_video = course_video;
        }

        public String getSpeaker() {
            return speaker;
        }

        public void setSpeaker(String speaker) {
            this.speaker = speaker;
        }

        public int getIs_free() {
            return is_free;
        }

        public void setIs_free(int is_free) {
            this.is_free = is_free;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getIs_heart() {
            return is_heart;
        }

        public void setIs_heart(int is_heart) {
            this.is_heart = is_heart;
        }

        public String getSpeaker_audio() {
            return speaker_audio;
        }

        public void setSpeaker_audio(String speaker_audio) {
            this.speaker_audio = speaker_audio;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
