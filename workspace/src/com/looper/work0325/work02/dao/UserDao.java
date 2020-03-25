package com.looper.work0325.work02.dao;

import com.looper.work0325.work02.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();
    User findUserByUsernameAndPassword (String username , String password);

}
