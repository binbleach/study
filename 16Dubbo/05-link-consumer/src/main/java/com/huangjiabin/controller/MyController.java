package com.huangjiabin.controller;

import com.huangjiabin.domain.User;
import com.huangjiabin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String getUsers(Model model){
        User user=userService.getUser();
        model.addAttribute("user",user);
        return "result";
    }
}
