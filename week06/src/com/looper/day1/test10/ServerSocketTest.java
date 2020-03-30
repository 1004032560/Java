package com.looper.day1.test10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务器端
 */
public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //步骤1：创建ServerSocket对象
        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        OutputStream os = null;

        ss = new ServerSocket(10086);
        System.out.println("服务启动了...");

        while (true) {
            //步骤2：监听客户端的请求
            s = ss.accept();
            //System.out.println("监听到客户端请求：" + s);
            //步骤3：读操作
            is = s.getInputStream();
            byte[] buf = new byte[100];
            int len = is.read(buf);
            String str = new String(buf, 0, len);
            System.out.println("接收到客户端发送来的数据是：" + str);
            if("byebye".equals(str)){
                is.close();
                s.close();
                break;
            }
            os = s.getOutputStream();
            System.out.print("请输入您要发送的消息：");
            String strBack = input.next();
            if("byebye".equals(strBack)){
                os.write(strBack.getBytes());
                is.close();
                os.close();
                s.close();
            }
            os.write(strBack.getBytes());

            is.close();
            os.close();
            s.close();
        }


    }
}
