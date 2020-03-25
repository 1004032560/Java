package com.looper.work0325.work02.dao.impl;

import com.looper.work0325.work02.dao.UserDao;
import com.looper.work0325.work02.domain.User;

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

    /*
    public static void main(String[] args) {
        for (User user : al) {
            System.out.println(user);
        }
    }
    */

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
