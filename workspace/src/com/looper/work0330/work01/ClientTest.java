package com.looper.work0330.work01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        OutputStream outputStream = null;
        InputStream inputStream = null;

        while(true){
            //1.创建socket对象
            Socket socket = new Socket("127.0.0.1",5900);

            //2.1.输出流操作
            System.out.print("请输入发给服务器的信息：");
            String resultStr = scanner.next();
            if ("end".equals(resultStr)) {
                //传输字节流
                outputStream = socket.getOutputStream();
                outputStream.write(resultStr.getBytes());

                outputStream.close();
                inputStream.close();
                socket.close();
            }
            outputStream = socket.getOutputStream();
            outputStream.write(resultStr.getBytes());

            //2.2.输入流操作
            inputStream = socket.getInputStream();
            byte[] buf = new byte[100];
            int len = inputStream.read(buf);
            //将字节数组转换成字符串
            String strGet = new String(buf,0,len);
            System.out.println("接收到服务器返回的数据是：" + strGet);
            if ("end".equals(strGet)){
                inputStream.close();
                outputStream.close();
                socket.close();
            }
            inputStream.close();
            outputStream.close();
            socket.close();
        }

    }

}
