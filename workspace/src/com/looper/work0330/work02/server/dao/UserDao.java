package com.looper.work0330.work02.server.dao;

import com.looper.work0330.work02.server.domain.User;

import java.util.List;

public interface UserDao {

    boolean findUserByUsernameAndPassword(String username,String password);

    List<User> showAll();

    void addUser(User user);

}
