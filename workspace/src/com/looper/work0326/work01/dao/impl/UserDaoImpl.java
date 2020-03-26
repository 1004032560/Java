package com.looper.work0326.work01.dao.impl;

import com.looper.work0326.work01.dao.UserDao;
import com.looper.work0326.work01.domain.User;

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

    @Override
    public boolean findUserByUsername(String username) {
        for (User user : al) {
            if (user.getUsername()==username){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> addUser(User user) {
        al.add(user);
        return null;
    }
}

