package com.tlkj.shiro4.controller;



import com.tlkj.shiro4.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(String username,String password){
        try {
            userService.checkLogin(username,password);
            System.out.println("登陆成功");
            return "index";
        } catch (Exception e) {
            System.out.println("密码错误");
            return "login";
        }
    }
}
