package com.zt.service.Impl;

import com.zt.dao.AdminDao;
import com.zt.pojo.admin;
import com.zt.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;

    @Override
    public String loginService(String id, String password) {
        admin admin = null;
        try{
            admin = adminDao.selectById(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        if(admin==null) return "ino";
        if(admin.getA_password().equals(password)) return "a_success";
        else return "pno";
    }
}
