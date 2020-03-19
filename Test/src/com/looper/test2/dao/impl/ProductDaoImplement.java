package com.looper.test2.dao.impl;

import com.looper.test2.dao.ProductDao;
import com.looper.test2.domain.User;

public class ProductDaoImplement implements ProductDao {

    User [] users = new User[5];

    static int index = 0;

    @Override
    public boolean addUser(User user) {
        users[index++] = user;
        return false;
    }

    @Override
    public User[] findAllUsers() {
        return new User[0];
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public boolean modifyPasswordByUsername(String username, String password, String newPassword) {

        for (User user : users) {
            if (user.getUsername().equals(username)){
                if (user.getPassword().equals(password)){
                    user.setPassword(newPassword);
                }
            }
        }
        System.out.println("未找到该用户！");

        return false;
    }
}
