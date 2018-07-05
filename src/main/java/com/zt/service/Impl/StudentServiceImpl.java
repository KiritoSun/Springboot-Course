package com.zt.service.Impl;

import com.zt.dao.StudentDao;
import com.zt.pojo.student;
import com.zt.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public String loginService(String id, String password) {
        student student = null;
        try{
            student = studentDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        if (student==null) return "ino";
        if(student.getS_password().equals(password)) return "s_success";
        else return "pno";
    }

    @Override
    public student getStudent(String id) {
        student student = null;
        try{
            student = studentDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return student;
    }
}
