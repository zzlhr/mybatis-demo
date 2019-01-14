package com.lhsite.mybatisdemo.services.impl;

import com.lhsite.mybatisdemo.entity.User;
import com.lhsite.mybatisdemo.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveAllUser() {
        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setUsername("张三");
        user.setPassword("123456");
        User user1 = new User();
        user1.setUsername("李四");
        user1.setPassword("123456");
        userList.add(user);
        userList.add(user1);
        userService.saveAllUser(userList);
    }

    @Test
    public void getUser() {
        log.info("【获取用户】user={}", userService.getUser(1));
    }


}