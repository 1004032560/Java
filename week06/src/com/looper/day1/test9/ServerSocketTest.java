package com.looper.day1.test9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 */
public class ServerSocketTest {

    public static void main(String[] args) {

        ServerSocket ss = null;
        Socket s = null;

        try {
            //1.创建ServerSocket对象；65536个端口号；1024之前的尽量不要用
            ss = new ServerSocket(10086);
            System.out.println("服务器启动了...");

            //2.监听客户端的请求
            s = ss.accept();
            System.out.println("监听到了客户端的请求:"+s);

            //3.具体的操作(读或者写)
            //服务器收到信息
            InputStream is = s.getInputStream();
            byte[] reqBuf = new byte[100];
            int len = is.read(reqBuf);
            String reqStr = new String(reqBuf,0,len);
            System.out.println("客户端的消息是:"+reqStr);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //服务器发出响应
            OutputStream os = s.getOutputStream();
            String respStr = "好的！";
            os.write(respStr.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源；服务器尽量不要关闭
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
