package com.xxx.controller;

import com.xxx.pojo.User;
import com.xxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegisterController {

    @Autowired(required = true)
    private UserService userService;

    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){

//        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService=(UserService)ctx.getBean("userService");

    System.out.println("收到注册信息："+user);
    userService.add(user);
    return "register done!";

    }
}
