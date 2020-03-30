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
        Scanner input = new Scanner(System.in);
        Socket s = null;
        OutputStream os = null;
        InputStream is = null;

        while(true){
            //步骤1：创建Socket对象
            s = new Socket("127.0.0.1", 10086);

            //步骤2：写操作
            //String str = "你好，服务器!";
            System.out.print("请输入您要发送的消息：");
            String str = input.next();
            if("byebye".equals(str)){
                //获取字节输出流
                os = s.getOutputStream();
                os.write(str.getBytes());
                //步骤3：关闭资源
                os.close();
                is.close();
                s.close();
                break;
            }
            //获取字节输出流
            os = s.getOutputStream();
            os.write(str.getBytes());

            is = s.getInputStream();
            byte[] buf = new byte[100];
            int len = is.read(buf);
            String strGet = new String(buf, 0, len);
            System.out.println("接收到服务器返回的数据是：" + strGet);
            if("byebye".equals(strGet)){
                //步骤3：关闭资源
                os.close();
                is.close();
                s.close();
                break;
            }

            //步骤3：关闭资源
            os.close();
            is.close();
            s.close();
        }
    }
}