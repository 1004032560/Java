package com.looper.work0326.work03.service;

import com.looper.work0326.work03.domain.User;

import java.util.List;

public interface UserService {

    //登录
    User login(String username, String password);
    //注册
    boolean register(String username,String password);
    //展示所有用户
    List<User> showAllUsers();


}
