package com.looper.work0313.work4.dao.impl;

import com.looper.work0313.work4.dao.UserDao;
import com.looper.work0313.work4.domain.User;

public class UserDaoImpl implements UserDao {
    User[] users = new User[5];
    int index = 0;
    public int userLength(){
        return users.length;
    }
    @Override
    public boolean addUser(User user) {
        if (index<5){
            users[index] = user;
            index++;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User[] findAllUsers() {
        return users;
    }

    @Override
    public User findUserByUsername(String username) {
        for (int i=0;i<users.length;i++){
            if (username.equals(users[i].getUsername())){
                return users[i];
            }
        }
        return null;
    }

    @Override
    public boolean modifyPasswordByUsername(String username, String password, String newPassword) {
        for (int i = 0; i < users.length; i++) {
            if (username.equals(users[i].getUsername())) {
                if (username.equals(users[i].getUsername())) {
                    if (password.equals(users[i].getPassword())) {
                        users[i].setPassword(newPassword);
                        return true;
                    } else {
                        System.out.println("密码错误");
                        return false;
                    }
                }
            }
            return false;
        }
        return false;
    }
}