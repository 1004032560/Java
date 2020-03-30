package com.looper.day1.test10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 */
public class SocketTest {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Socket s = null;

        //1.创建Socket对象
        s = new Socket("127.0.0.1", 10086);

        while(true){
            //2.操作
            //向服务器发出请求
            System.out.print("请输入客户端要发送的信息:");
            String str = sc.next();
            String reqStr = str;
            //Socket中的数据输出流
            OutputStream os = s.getOutputStream();
            os.write(reqStr.getBytes());

            //接收服务器请求
            InputStream is = s.getInputStream();
            byte[] respBuf = new byte[100];
            int respLen = is.read(respBuf);
            String respStr = new String(respBuf, 0, respLen);
            System.out.println("服务端的消息是:" + respStr);
            if ("886".equals(respStr)){
                break;
            }

            //3.关闭资源
            s.close();
        }

    }

}

