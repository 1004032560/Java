package com.looper.test2.dao;

import com.looper.test2.domain.User;

public interface ProductDao {

    boolean addUser(User user);
    User[] findAllUsers();
    User findUserByUsername(String username);
    boolean modifyPasswordByUsername (String username, String password,String newPassword);

}
