package com.csf.controller;

import com.csf.pojo.User;
import com.csf.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getusername")
    public ModelAndView hello(ModelAndView modelAndView, @RequestParam String id) {

        String name = userService.getUserName(id);
        modelAndView.addObject("username", name);
        modelAndView.setViewName("username");
        return modelAndView;
    }

    @RequestMapping("/getall")
    @ResponseBody
    public List<User> All(Model model) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        return userService.getUserAll();
    }

}