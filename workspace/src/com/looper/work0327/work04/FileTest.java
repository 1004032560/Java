package com.looper.work0327.work04;

import java.io.*;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        loop:while (true){
            System.out.println("-------------文件操作系统----------");
            System.out.println("--------------1.读取文件----------");
            System.out.println("--------------2.写入文件----------");
            System.out.println("----------------3.退出------------");
            System.out.print("请输选择:");
            int num = scanner.nextInt();
            switch(num){
                case 1:{
                    System.out.print("请输入文件路径:");
                    String path = scanner.next();
                    System.out.print("请输入文件名:");
                    String fileName = scanner.next();
                    File file = new File(path+fileName);
                    try {
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        String str = br.readLine();
                        while(str!=null){
                            System.out.println(str);
                            str = br.readLine();
                        }
                        br.close();
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2:{
                    System.out.print("请输入文件路径:");
                    String path = scanner.next();
                    System.out.print("请输入文件名:");
                    String fileName = scanner.next();
                    File file = new File(path+fileName);
                    if (file.exists()){
                        System.out.println("请输入存入文件的内容：");
                        String fileValue = scanner.next();
                        try {
                            FileWriter fw = new FileWriter(file,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(fileValue);
                            bw.close();
                            fw.close();
                            System.out.println("写入成功");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        file.mkdirs();
                        System.out.println("请输入存入文件的内容：");
                        String fileValue = scanner.next();
                        try {
                            FileWriter fw = new FileWriter(file);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.newLine();
                            bw.write(fileValue);
                            bw.close();
                            fw.close();
                            System.out.println("写入成功");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                case 3:{
                    break loop;
                }
            }
        }

    }

}
