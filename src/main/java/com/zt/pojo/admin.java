package com.zt.pojo;

import java.io.Serializable;

public class admin implements Serializable{
    private String a_id;
    private String a_password;

    public admin(){}

    public admin(String a_id, String a_password) {
        this.a_id = a_id;
        this.a_password = a_password;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    @Override
    public String toString() {
        return "admin{" +
                "a_id='" + a_id + '\'' +
                ", a_password='" + a_password + '\'' +
                '}';
    }
}
