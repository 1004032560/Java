package com.looper.day2.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServerTest {

    public static void main(String[] args) throws IOException {

        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10086);
        System.out.println("服务器已启动...");
        //2.创建DatagramPacket对象
        byte[] buf = new byte[1024*10];
        DatagramPacket dp = new DatagramPacket(buf,buf.length);

        while(true){
            //3.接受数据
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println("接受到的数据是："+str);
        }

    }

}
