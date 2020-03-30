package com.looper.day1.test11;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket ss = new ServerSocket(5900);
        System.out.println("服务器启动。。。。");
        Socket s = new Socket();
        s = ss.accept();

        InputStream is = s.getInputStream();
        //创建对象的输入流的对象
        ObjectInputStream ois = new ObjectInputStream(is);
        //读取对象
        Object obj = ois.readObject();
        System.out.println("接收到客户端的数据："+obj);

        ois.close();
        is.close();
        s.close();

    }

}
