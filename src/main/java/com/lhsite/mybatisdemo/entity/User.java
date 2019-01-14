package com.lhsite.mybatisdemo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Integer uid;

    private String username;

    private String password;

}
