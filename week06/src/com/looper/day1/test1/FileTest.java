package com.looper.day1.test1;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("/1.soft/23.txt");

        System.out.println("是否存在："+file.exists());
        System.out.println("========================");

        //文件的大小
        System.out.println("文件的大小为："+file.length());
        System.out.println("========================");

        /*//删除文件
        file.delete();
        System.out.println("是否存在："+file.exists());
        System.out.println("========================");*/

        //创建文件
        file.createNewFile();
        System.out.println("是否存在："+file.exists());
        System.out.println("========================");

    }

}
