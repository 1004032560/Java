package com.looper.work0314.work2.dao.impl;

import com.looper.work0314.work2.dao.UserDao;
import com.looper.work0314.work2.domain.User;

public class UserDaoImpl implements UserDao {

    public static User [] users = new User[5];

    static{
        users[0] = new User(1001,"ABC","123456","admin");
        users[1] = new User(1002,"DEF","123456","common");
        users[2] = new User(1003,"JKL","123456","common");
        users[3] = new User(1004,"QWE","123456","common");
        users[4] = new User(1005,"ZXC","123456","common");
    }

    @Override
    public User[] findAllUsers() {
        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
