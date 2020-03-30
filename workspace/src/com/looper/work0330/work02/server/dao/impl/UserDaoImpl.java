package com.looper.work0330.work02.server.dao.impl;

import com.looper.work0330.work02.server.dao.UserDao;
import com.looper.work0330.work02.server.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    List<User> al = new ArrayList<>();

    public UserDaoImpl() {

        al.add(new User(1001,"admin","123456","admin"));
        al.add(new User(1002,"uio","123456","common"));
        al.add(new User(1003,"jkl","123456","common"));
        al.add(new User(1004,"bnm","123456","common"));
        al.add(new User(1005,"asd","123456","common"));

    }

    @Override
    public boolean findUserByUsernameAndPassword(String username, String password) {

        for (User user : al) {
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
                return true;
            }
        }

        return false;
    }

    @Override
    public List<User> showAll() {
        return al;
    }

    @Override
    public void addUser(User user) {
        al.add(user);
    }
}
