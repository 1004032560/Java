package com.looper.work0330.work02.client;

import com.looper.work0330.work02.server.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);


        System.out.print("请输入用户名：");
        String username = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();
        System.out.print("请输入ID：");
        int id = sc.nextInt();
        System.out.print("请输入角色：");
        String role = sc.next();

        Socket s = new Socket("127.0.0.1", 5900);

        OutputStream os = s.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);

        User user = new User(id, username, password, role);
        oos.writeObject(user);

        InputStream is = s.getInputStream();
        byte[] buf = new byte[200];
        int len = is.read(buf);
        String str = new String(buf, 0, len);
        System.out.println(str);

        if (!"登录成功！".equals(str)){
            Socket s1 = new Socket("127.0.0.1", 5900);

            OutputStream os1 = s1.getOutputStream();
            System.out.print("请输入选择：");
            String str1 = sc.next();
            os1.write(str1.getBytes());

            InputStream is1 = s1.getInputStream();
            byte[] buf1 = new byte[200];
            int len1 = is1.read(buf1);
            String str2 = new String(buf1, 0, len1);
            System.out.println(str2);

            is1.close();
            os1.close();
            s1.close();
        }

        oos.close();
        os.close();
        s.close();

    }

}
