package com.zt.controller;

import com.zt.pojo.course;
import com.zt.pojo.student;
import com.zt.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CreatePageController {
    @Resource
    private CourseService courseService;

    // 请求访问学生首页
    @RequestMapping("/studentIndex")
    public String studentIndex(){
        return "student/index";
    }

    // 请求访问学生个人中心
    @RequestMapping("/studentInfo")
    public String studentInfo(){
        return "student/info";
    }

    // 请求访问课程
    @RequestMapping("/course")
    public String course(@RequestParam("page") int page, HttpServletRequest request){
        HttpSession session = null;
        try{
            session = request.getSession();
            List<course> list = courseService.sortPage(page);
            int number = courseService.getNumber();
            session.setAttribute("course",list);
            session.setAttribute("number",number);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return "student/course";
    }
}
