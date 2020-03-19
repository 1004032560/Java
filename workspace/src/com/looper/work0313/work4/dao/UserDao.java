package com.looper.work0313.work4.dao;

import com.looper.work0313.work4.domain.User;


public interface UserDao {

    boolean addUser(User user);
    User[] findAllUsers();
    User findUserByUsername(String username);
    boolean modifyPasswordByUsername (String username, String password,String newPassword);

}
