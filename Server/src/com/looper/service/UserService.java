package com.looper.service;

import com.looper.domain.User;

import java.util.List;

public interface UserService {
    //注册业务
    boolean register(int id,String username, String password,String role);
    //登录业务
    User login(String username, String password);
    //查询所有用户信息的业务
    List<User> listAllUsers();
}
