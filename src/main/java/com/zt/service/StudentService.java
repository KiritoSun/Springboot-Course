package com.zt.service;

import com.zt.pojo.student;

public interface StudentService {
    // 处理登录判断业务
    public String loginService(String id,String password);
    // 根据id获取student业务
    public student getStudent(String id);
}
