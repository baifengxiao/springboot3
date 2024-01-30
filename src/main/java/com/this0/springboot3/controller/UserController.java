package com.this0.springboot3.controller;

import com.this0.springboot3.pojo.User;
import com.this0.springboot3.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<User> getUser(){
        List<User> userList = userService.findList();
        log.info("查询的user数据为:{}",userList);
        return userList;
    }

}