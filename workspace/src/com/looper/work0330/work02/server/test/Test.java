package com.looper.work0330.work02.server.test;

import com.looper.work0330.work02.server.dao.UserDao;
import com.looper.work0330.work02.server.dao.impl.UserDaoImpl;
import com.looper.work0330.work02.server.domain.User;
import com.looper.work0330.work02.server.service.RegisterService;

public class Test {

    public static void main(String[] args) {

        UserDao userDao = new UserDaoImpl();

        RegisterService registerService = new RegisterService();

        registerService.register(new User(1009,"looper","123456","admin"));

        for (User user : userDao.showAll()) {
            System.out.println(user);
        }

    }

}
