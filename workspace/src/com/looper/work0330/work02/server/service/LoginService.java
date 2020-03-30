package com.looper.work0330.work02.server.service;

import com.looper.work0330.work02.server.dao.impl.UserDaoImpl;
import com.looper.work0330.work02.server.domain.User;

public class LoginService {

    UserDaoImpl userDao = new UserDaoImpl();

    public boolean login(String username,String password){
        return userDao.findUserByUsernameAndPassword(username,password);
    }

}
