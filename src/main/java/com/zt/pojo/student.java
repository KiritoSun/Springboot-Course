package com.zt.pojo;

import java.io.Serializable;

public class student implements Serializable {
    private String s_id;
    private String s_name;
    private String s_password;
    private String s_sex;
    private String s_major;
    private int s_point;

    public student(){}

    public student(String s_id, String s_name, String s_password, String s_sex, String s_major, int s_point) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_password = s_password;
        this.s_sex = s_sex;
        this.s_major = s_major;
        this.s_point = s_point;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_major() {
        return s_major;
    }

    public void setS_major(String s_major) {
        this.s_major = s_major;
    }

    public int getS_point() {
        return s_point;
    }

    public void setS_point(int s_point) {
        this.s_point = s_point;
    }

    @Override
    public String toString() {
        return "student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_major='" + s_major + '\'' +
                ", s_point=" + s_point +
                '}';
    }
}
