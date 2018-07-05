package com.zt.controller;

import com.zt.pojo.student;
import com.zt.service.AdminService;
import com.zt.service.StudentService;
import com.zt.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class VerificationController {
    @Resource
    private StudentService studentService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private AdminService adminService;

    // 拦截登录请求
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public void login(@RequestParam(value = "id") String id,
                      @RequestParam(value = "password") String password,
                      HttpServletResponse response, HttpServletRequest request){
        PrintWriter out = null;
        HttpSession session = null;
        try{
            out = response.getWriter();
            session = request.getSession();
            String user = session.getAttribute("user").toString();
            String result = "";
            switch (user){
                case "student":{
                    result = studentService.loginService(id,password);
                    if(result.equals("s_success")){
                        student student = studentService.getStudent(id);
                        session.setAttribute("student",student);
                    }
                    break;
                }
                case "teacher":{
                    result = teacherService.loginService(id,password);
                    if(result.equals("t_success")){
                        session.setAttribute("t_id",id);
                    }
                    break;
                }
                case "admin":{
                    result = adminService.loginService(id,password);
                    if(result.equals("a_success")){
                        session.setAttribute("a_id",id);
                    }
                    break;
                }
                default:break;
            }
            out.print(result);
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }
}
