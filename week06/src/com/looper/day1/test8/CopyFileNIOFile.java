package com.looper.day1.test8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * 通过NIO完成文件的复制
 */

public class CopyFileNIOFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("E:/2233.txt");
        FileOutputStream fos = new FileOutputStream("E:/23.txt");

        //获取通道对象
        FileChannel fc1 = fis.getChannel();
        FileChannel fc2 = fos.getChannel();

        //完成文件复制
        fc1.transferTo(0,fc1.size(),fc2);

        fc1.close();
        fc2.close();
        fos.close();
        fis.close();

        System.out.println("复制成功");
    }

}
