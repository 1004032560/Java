package com.looper.day1.test1;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

    public static void main(String[] args) throws IOException {

        File file = new File("/2233.txt");

        //判断是不是目录
        System.out.println("判断是不是目录:"+file.isDirectory());
        System.out.println("========================");

        //判断是不是文件
        System.out.println("判断是不是文件:"+file.isFile());
        System.out.println("========================");

        //获取文件名
        System.out.println("获取文件名:"+file.getName());

    }


}
