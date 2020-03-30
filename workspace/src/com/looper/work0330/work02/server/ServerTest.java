package com.looper.work0330.work02.server;

import com.looper.work0330.work02.server.dao.impl.UserDaoImpl;
import com.looper.work0330.work02.server.domain.User;
import com.looper.work0330.work02.server.service.LoginService;
import com.looper.work0330.work02.server.service.RegisterService;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LoginService loginService = new LoginService();
        RegisterService registerService = new RegisterService();
        UserDaoImpl userDao = new UserDaoImpl();

        ServerSocket ss = new ServerSocket(5900);
        Socket s = new Socket();
        System.out.println("服务器启动...");

        s = ss.accept();

        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User) ois.readObject();

        boolean flag = false;

        if (loginService.login(user.getUsername(), user.getPassword())) {

            OutputStream os = s.getOutputStream();
            String strOut = "登录成功！";
            os.write(strOut.getBytes());

            flag = true;

            os.close();
            ois.close();
            is.close();
            s.close();

        }else {
            OutputStream os = s.getOutputStream();
            String strOut = "用户名或密码输入错误," +
                    "是否为您注册该用户?\n" +
                    "y:继续注册\n" +
                    "n:退出";
            os.write(strOut.getBytes());
            os.close();
        }

        ois.close();
        is.close();

        if (!flag){


            Socket s1 = new Socket();
            s1 = ss.accept();
            InputStream is1 = s1.getInputStream();
            byte[] buf1 = new byte[100];
            int len1 = is1.read(buf1);
            String str = new String(buf1, 0, len1);

            if ("y".equals(str)) {
                registerService.register(user);
                System.out.println(user);
                OutputStream os1 = s1.getOutputStream();
                String strOut1 = "注册成功！";
                os1.write(strOut1.getBytes());
                os1.close();
                for (User user1 : userDao.showAll()) {
                    System.out.println(user1);
                }
            } else {
                OutputStream os1 = s1.getOutputStream();
                String strOut1 = "退出成功！";
                os1.write(strOut1.getBytes());
                os1.close();
            }
            is1.close();
            s1.close();

            s.close();
        }

        s.close();

    }

}