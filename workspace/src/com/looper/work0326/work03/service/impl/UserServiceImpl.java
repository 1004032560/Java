package com.looper.work0326.work03.service.impl;

import com.looper.work0326.work03.domain.User;
import com.looper.work0326.work03.service.UserService;
import com.looper.work0326.work03.dao.UserDao;
import com.looper.work0326.work03.dao.impl.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao ud = new UserDaoImpl();


    @Override
    public User login(String username, String password) {
        return ud.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public boolean register(String username, String password) {
        if(!ud.findUserByUsername(username)){//用户不存在
            ud.addUser(new User(username,password));
        }
        System.out.println("用户名已经存在！");
        return false;

    }

    @Override
    public List<User> showAllUsers() {
        return ud.findAllUsers();
    }
}
