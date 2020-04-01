package com.looper.test;

import com.looper.domain.Data;
import com.looper.domain.User;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Socket s = new Socket("127.0.0.1",5900);

        OutputStream os =  s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        System.out.println("1.登录2.注册");
        System.out.print("请输入选择：");
        String sel = input.next();
        User user = null;
        Data data = null;
        if("1".equals(sel)){
            System.out.print("请输入用户名：");
            String username = input.next();
            System.out.print("请输入密码：");
            String password = input.next();
            //写对象
            user = new User(username,password);
            data = new Data("登录",user);
        }else if("2".equals(sel)){
            System.out.print("请输入id：");
            int id = input.nextInt();

            System.out.print("请输入用户名：");
            String username = input.next();

            System.out.print("请输入密码：");
            String password = input.next();

            System.out.print("请输入角色：");
            String role = input.next();
            //写对象
            user = new User(id,username,password,role);
            data = new Data("注册",user);
        }

        System.out.println("准备传输的对象："+user);
        oos.writeObject(data);


        InputStream is =  s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        //读对象
        Object obj =   ois.readObject();
        System.out.println("客户端接收到的结果："+obj);

        Data dataBack = (Data)obj;

        if(dataBack.getUser()!=null) {
            if ("admin".equals(dataBack.getUser().getRole()) ){
                System.out.println("欢迎来到管理员界面");
                System.out.println("1.显示所有用户信息");
                System.out.print("请输入选择：");
                String sel2 = input.next();
                for (User dataBackUser : dataBack.getUsers()) {
                    System.out.println(dataBackUser);
                }

            }else {
                System.out.println("欢迎来到普通员界面");
                System.out.println("1.显示信息2.修改密码3.退出");
                System.out.print("请输入选择：");
                String sel2 = input.next();
                System.out.println(dataBack.getUser());

                //data = new Data("1",user);

            }
        }else if (dataBack.getUser()==null&&!dataBack.isFlag()){
            System.out.println("登录失败！");
        }

        if (dataBack.isFlag()){
            System.out.println("注册成功");
        }else if (dataBack.getUser()!=null&&dataBack.isFlag()){
            System.out.println("注册失败");
        }

        ois.close();
        is.close();
        oos.close();
        os.close();
        s.close();

    }
}
