package com.this0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String sayHello(){
        return "你好!"+robotProperties.getName();
    }
}