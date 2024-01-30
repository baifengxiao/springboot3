package com.this0.springboot3.service;


import com.this0.springboot3.mapper.UserMapper;
import com.this0.springboot3.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findList(){
        List<User> users = userMapper.queryAll();
        log.info("查询全部数据:{}",users);
        return users;
    }
}
