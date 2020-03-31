package com.looper.day1.test7;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("E:/2233.txt","rw");
        raf.writeInt(10);
        raf.writeDouble(12.23);
        raf.writeUTF("looper");

        //将指针指向最开始的位置
        raf.seek(0);
        System.out.println(raf.readInt());

        //使用指针跳过double类型的数据
        raf.skipBytes(8);
        System.out.println(raf.readUTF());

    }

}
