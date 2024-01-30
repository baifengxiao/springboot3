package com.this0.springboot3.controller;

import com.this0.springboot3.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(dataSourceProperties);
        return "Hello,Spring Boot 3!";
    }
}
