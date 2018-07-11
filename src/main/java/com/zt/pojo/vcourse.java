package com.zt.pojo;

public class vcourse {
    private String c_id;
    private String c_name;
    private String c_room;
    private String c_time;
    private int c_point;
    private int point;

    public vcourse(){}

    public vcourse(course course,int point){
        this.c_id = course.getC_id();
        this.c_name = course.getC_name();
        this.c_room = course.getC_room();
        this.c_time = course.getC_time();
        this.c_point = course.getC_point();
        this.point = point;
    }

    public vcourse(String c_id, String c_name, String c_room, String c_time, int c_point, int point) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_room = c_room;
        this.c_time = c_time;
        this.c_point = c_point;
        this.point = point;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_room() {
        return c_room;
    }

    public void setC_room(String c_room) {
        this.c_room = c_room;
    }

    public String getC_time() {
        return c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public int getC_point() {
        return c_point;
    }

    public void setC_point(int c_point) {
        this.c_point = c_point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "vcourse{" +
                "c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", c_room='" + c_room + '\'' +
                ", c_time='" + c_time + '\'' +
                ", c_point=" + c_point +
                ", point=" + point +
                '}';
    }
}
