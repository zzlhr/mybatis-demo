package com.lhsite.mybatisdemo.dao;

import com.lhsite.mybatisdemo.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


@Component
@org.apache.ibatis.annotations.Mapper
public interface UserDao extends Mapper<User>, MySqlMapper<User> {
}
