package com.looper.dao.impl;

import com.looper.dao.UserDao;
import com.looper.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    List<User> users = new ArrayList<User>();

    public UserDaoImpl() {
        users.add(new User(1001,"jkl","123","admin"));
        users.add(new User(1002,"iop","123","common"));
        users.add(new User(1004,"asd","123","common"));
        users.add(new User(0,"qwe","123",""));
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        for (User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){//找到了用户
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean findUserByUsername(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)){//用户名已经存在，不能注册
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        return users.add(user);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
