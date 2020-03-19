package com.looper.work0314.work2.dao;

import com.looper.work0314.work2.domain.User;

public interface UserDao {
    User[] findAllUsers();
    User findUserByUsernameAndPassword (String username , String password);

}
