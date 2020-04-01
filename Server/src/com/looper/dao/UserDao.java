package com.looper.dao;

import com.looper.domain.User;

import java.util.List;

public interface UserDao {
    //通过用户名和密码查找用户
    User findUserByUsernameAndPassword(String username, String password);
    //通过用户名查找用户是否存在
    boolean  findUserByUsername(String username);
    //添加用户
    boolean addUser(User user);
    //显示所有用户
    List<User> findAllUsers();
}

