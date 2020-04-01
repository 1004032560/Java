package com.looper.test;

import com.looper.domain.Data;
import com.looper.domain.User;
import com.looper.service.UserService;
import com.looper.service.impl.UserServiceImpl;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(5900);
        System.out.println("服务器启动...");
        Socket s = ss.accept();
        System.out.println("监听到对象："+s);

        InputStream is =  s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        //读对象
        Object obj = ois.readObject();
        System.out.println("接收到的用户是："+obj);
        //你让我干什么  获取msg
        //向下造型
        Data data =(Data)obj;
        String msg = data.getMsg();
        Data dataBack = null;
        if("登录".equals(msg)){
            UserService us = new UserServiceImpl();
            User userFind = us.login(data.getUser().getUsername(),data.getUser().getPassword());
            if ("admin".equals(userFind.getRole())){
                dataBack = new Data(userFind,us.listAllUsers());
                for (User listAllUser : us.listAllUsers()) {
                    System.out.println(listAllUser);
                }
            }else{
                dataBack = new Data(userFind);
                System.out.println("服务器查询的结果："+userFind);
            }
        }else if("注册".equals(msg)){
            UserService us = new UserServiceImpl();
            if (us.register(data.getUser().getId(),data.getUser().getUsername(),data.getUser().getPassword(),data.getUser().getRole())){
                dataBack = new Data(true);
            }else{
                dataBack = new Data(false);
            }

        }

        OutputStream os =  s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        //写对象
        oos.writeObject(dataBack);

        oos.close();
        os.close();
        ois.close();
        is.close();
        s.close();
    }
}
