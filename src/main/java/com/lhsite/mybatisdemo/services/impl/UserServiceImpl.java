package com.lhsite.mybatisdemo.services.impl;

import com.lhsite.mybatisdemo.dao.UserDao;
import com.lhsite.mybatisdemo.entity.User;
import com.lhsite.mybatisdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(Integer uid) {
        User user = new User();
        user.setUid(uid);
        return userDao.select(user).get(0);
    }

    @Override
    public void saveAllUser(List<User> users) {
        userDao.insertList(users);
    }
}
