package com.this0.controller;

import com.this0.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RobotService robotService;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(robotService.sayHello());
        return "Hello,Spring Boot 3!";
    }
}