package com.looper.work0330.work01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        //1.创建ServerSocket对象
        ServerSocket server = new ServerSocket(5900);
        Socket socket = new Socket();
        System.out.println("服务器启动...");

        while(true){
            //2.监听客户端的请求
            socket = server.accept();

            //3.1.接收数据操作
            InputStream inputStream = socket.getInputStream();
            byte[] buf = new byte[100];
            int len = inputStream.read(buf);
            //将字节数组转换成字符串
            String strGet = new String(buf,0,len);
            System.out.println("接收到客户端返回的数据是：" + strGet);
            if ("end".equals(strGet)){

                inputStream.close();
                socket.close();
                break;
            }

            //3.2.发送数据操作
            OutputStream outputStream = socket.getOutputStream();
            System.out.print("请输入发给客户端的信息：");
            String resultStr = scanner.next();
            if ("end".equals(resultStr)) {
                //传输字节流
                outputStream.write(resultStr.getBytes());

                outputStream.close();
                inputStream.close();
                socket.close();
            }
            outputStream.write(resultStr.getBytes());
            //4.关闭流
            outputStream.close();
            inputStream.close();
            socket.close();

        }

    }

}
