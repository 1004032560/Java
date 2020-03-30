package com.looper.day1.test9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class SocketTest {

    public static void main(String[] args) {

        Socket s = null;

        try {
            //1.创建Socket对象
            s = new Socket("127.0.0.1",10086);

            //2.操作
            //向服务器发出请求
            String str = "我是looper";
            //Socket中的数据输出流
            OutputStream os =  s.getOutputStream();
            os.write(str.getBytes());
            //接收服务器请求
            InputStream is = s.getInputStream();
            byte[] respBuf = new byte[100];
            int respLen = is.read(respBuf);
            String respStr = new String(respBuf,0,respLen);
            System.out.println("服务端的消息是:"+respStr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭资源
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
