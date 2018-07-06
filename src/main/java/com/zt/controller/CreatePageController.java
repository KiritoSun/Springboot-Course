package com.zt.controller;

import com.zt.pojo.course;
import com.zt.pojo.student;
import com.zt.service.CourseService;
import com.zt.service.StudentService;
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
    private StudentService studentService;
    @Resource
    private CourseService courseService;

    // 请求访问学生首页
    @RequestMapping("/studentIndex")
    public String studentIndex(HttpServletRequest request){
        updatePageInfo(request);
        return "student/index";
    }

    // 请求访问学生个人中心
    @RequestMapping("/studentInfo")
    public String studentInfo(HttpServletRequest request){
        updatePageInfo(request);
        return "student/info";
    }

    // 请求课程分页显示
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

    // 请求更新页面信息
    public void updatePageInfo(HttpServletRequest request){
        try{
            HttpSession session = request.getSession();
            String id = ((student)session.getAttribute("student")).getS_id();
            student student = studentService.getStudent(id);
            session.setAttribute("student",student);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
    }

}
