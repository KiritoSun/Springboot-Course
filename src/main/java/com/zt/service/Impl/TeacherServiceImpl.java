package com.zt.service.Impl;

import com.zt.dao.TeacherDao;
import com.zt.pojo.teacher;
import com.zt.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    @Override
    public String loginService(String id, String password) {
        teacher teacher = null;
        try{
            teacher = teacherDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        if(teacher==null) return "ino";
        if(teacher.getT_password().equals(password)) return "t_success";
        else return "pno";
    }
}
