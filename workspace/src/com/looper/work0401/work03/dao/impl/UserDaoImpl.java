package com.looper.work0401.work03.dao.impl;

import com.looper.work0401.work03.domain.User;
import com.looper.work0401.work03.dao.UserDao;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    static List<User> al = new ArrayList<>();

    static{
        al.add(new User(1001,"ABC","123456","admin"));
        al.add(new User(1002,"DEF","123456","common"));
        al.add(new User(1003,"JKL","123456","common"));
        al.add(new User(1004,"QWE","123456","common"));
        al.add(new User(1005,"ZXC","123456","common"));
    }

    @Override
    public List<User> findAllUsers() {
        return al;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        for (User user : al) {
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
