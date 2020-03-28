package com.looper.work0327.work03;

import java.io.File;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入文件目录的路径：");
        String path = scanner.next();

        File file = new File(path);

        //判断文件是否存在
        if( file.exists()){

            //判断是不是目录
            if(file.isDirectory()){

                File[] files = file.listFiles();
                System.out.println("该路径下的文件和目录：");
                for (File file1 : files) {
                    System.out.println(file1);
                }
            }else{
                //文件的长度
                System.out.println("文件的长度为："+file.length());
            }

        }else {
            System.out.println("此文件不存在");
        }
    }
}

