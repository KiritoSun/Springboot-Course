package com.zt.service;

import com.zt.pojo.student;

public interface StudentService {
    // 处理登录判断业务
    public String loginService(String id,String password);
    // 根据id获取student业务
    public student getStudent(String id);
    // 修改学生信息业务
    public boolean updateService(String id,String name,String sex,String password,String major);
}
