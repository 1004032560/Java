package com.looper.service.impl;

import com.looper.dao.UserDao;
import com.looper.dao.impl.UserDaoImpl;
import com.looper.domain.User;
import com.looper.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();
    @Override
    public boolean register(int id,String username, String password,String role) {
        boolean flag = ud.findUserByUsername(username);
        if(flag){
            return false;
        }else{
           return ud.addUser(new User(id,username,password,role));
        }
    }

    @Override
    public User login(String username, String password) {
        return ud.findUserByUsernameAndPassword(username, password);
    }

    @Override
    public List<User> listAllUsers() {
        return ud.findAllUsers();
    }
}
