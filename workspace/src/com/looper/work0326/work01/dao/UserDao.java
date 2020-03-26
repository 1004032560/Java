package com.looper.work0326.work01.dao;

import com.looper.work0326.work01.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();
    User findUserByUsernameAndPassword (String username , String password);
    boolean findUserByUsername(String username);
    List<User> addUser(User user);

}
