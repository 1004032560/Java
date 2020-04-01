package com.looper.work0401.work03.dao;

import com.looper.work0401.work03.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();
    User findUserByUsernameAndPassword(String username, String password);

}
