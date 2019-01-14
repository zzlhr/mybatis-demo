package com.lhsite.mybatisdemo.services;

import com.lhsite.mybatisdemo.entity.User;

import java.util.List;

public interface UserService {

    User getUser(Integer uid);

    void saveAllUser(List<User> users);


}
