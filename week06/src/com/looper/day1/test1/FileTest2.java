package com.looper.day1.test1;

import java.io.File;
import java.io.IOException;

public class FileTest2 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:/2233/2233.txt");
        System.out.println("文件是否存在"+file.exists());

        file.mkdir();//只能创建最后一级
        System.out.println("文件是否存在"+file.exists());

        file.mkdirs();//可以创建不存在的父级
        System.out.println("文件是否存在"+file.exists());

    }

}
