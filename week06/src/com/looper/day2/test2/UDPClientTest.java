package com.looper.day2.test2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClientTest {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(5000);
        System.out.println("准备发送数据");
        System.out.print("请输入要发送的数据：");
        //2.准备发送数据为byte[]类型
        String str = sc.next();
        //3.创建
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(), InetAddress.getByName("127.0.0.1"),10086);
        //4.发送数据报
        ds.send(dp);

    }

}
