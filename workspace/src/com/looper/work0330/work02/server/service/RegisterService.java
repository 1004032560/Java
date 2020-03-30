package com.looper.work0330.work02.server.service;

import com.looper.work0330.work02.server.dao.impl.UserDaoImpl;
import com.looper.work0330.work02.server.domain.User;

public class RegisterService {

    UserDaoImpl userDao = new UserDaoImpl();

    public void register(User user){
        userDao.addUser(user);
    }

}
