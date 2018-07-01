package com.zt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/index")
    public String index(){
        return "student/index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }

}
