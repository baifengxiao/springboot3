package com.this0.springboot3.mapper;

import com.this0.springboot3.pojo.User;

import java.util.List;
public interface UserMapper {

    List<User> queryAll();
}