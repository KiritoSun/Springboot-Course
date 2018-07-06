package com.zt.controller;

import com.zt.pojo.student;
import com.zt.service.StudentService;
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
public class StudentController {
    @Resource
    private StudentService studentService;

    // 修改个人信息
    @RequestMapping(value = "/updateStudentInfo",method = RequestMethod.POST)
    public void updateStudentInfo(@RequestParam(value = "name") String name,
                                  @RequestParam(value = "password") String password,
                                  @RequestParam(value = "sex") String sex,
                                  @RequestParam(value = "major") String major,
                                  HttpServletRequest request, HttpServletResponse response){
        HttpSession session = null;
        PrintWriter out = null;
        try{
            out = response.getWriter();
            session = request.getSession();
            String id = ((student)session.getAttribute("student")).getS_id();
            boolean ch = studentService.updateService(id,name,sex,password,major);
            if(ch) out.print("success");
            else out.print("error");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 退出登录
    @RequestMapping("/exit")
    public String exit(HttpServletRequest request){
        HttpSession session = null;
        try{
            session = request.getSession();
            session.removeAttribute("student");
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return "login/login";
    }

}
