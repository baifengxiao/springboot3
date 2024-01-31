package com.this0.springboot3;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.this0.springboot3.mapper.UserMapper;
import com.this0.springboot3.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest //springboot下测试环境注解
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testAdd() {
        User user = new User();
        user.setId(32);
        user.setName("cyl");
        user.setAge(24);
        user.setEmail("123@qq.com");
        userMapper.insert(user);
    }

    /**
     * 通用 查询操作
     */
    @Test
    public void testCommonSelect() {
//        //1. 通过id查询
        User user = userMapper.selectById(32);
        System.out.println(user);

//        //2. 通过多个列查询一条数据
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",32).eq("name","cyl");
        User result = userMapper.selectOne(queryWrapper);
		System.out.println("result: " +result );


////        3. 通过多个id批量查询    <foreach>
        List<Integer> list = Arrays.asList(1, 2, 3);

        List<User> users = userMapper.selectBatchIds(list);
        System.out.println(users);

////        4. 通过Map封装条件查询(满足条件的所有结果)
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("name","Jone");

        List<User> users1 = userMapper.selectByMap(map);
        System.out.println(users1);

//
//        //5. 分页查询 需要配置分页插件
        Page<User> userPage = userMapper.selectPage(new Page<>(2, 3), null);
        List<User> userList = userPage.getRecords();
        System.out.println("分页查询结果"+userList);
    }
}
