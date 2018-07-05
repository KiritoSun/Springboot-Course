package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class VisitController {

    // 请求访问学生
    @RequestMapping("/student")
    public String student(HttpServletRequest request){
        HttpSession session = null;
        try{
            session = request.getSession();
            session.setAttribute("user","student");
            session.setAttribute("menu","index");
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        if(session.getAttribute("student")==null) return "login/login";
        else return "student/index";
    }

    // 请求访问老师
    @RequestMapping("/teacher")
    public String teacher(HttpServletRequest request){
        HttpSession session = null;
        try{
            session = request.getSession();
            session.setAttribute("user","teacher");
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        if(session.getAttribute("t_id")==null) return "login/login";
        else return "teacher/index";
    }

    // 请求访问管理员
    @RequestMapping("/admin")
    public String admin(HttpServletRequest request){
        HttpSession session = null;
        try{
            session = request.getSession();
            session.setAttribute("user","admin");
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        if(session.getAttribute("a_id")==null) return "login/login";
        else return "admin/index";
    }

}
