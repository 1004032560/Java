package com.looper.work0327.work01;

import java.io.*;

public class Test {

    public static void main(String[] args) {

        File file = new File("/2233.txt");

        try {
            //字节流输出
            FileOutputStream fos = new FileOutputStream(file);
            //对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //创建对象
            People people = new People(1001,"jkl",18,"上海陆家嘴");
            //对象写入文件
            oos.writeObject(people);
            //字节输入流
            //FileInputStream fis = new FileInputStream(file);
            //对象输入流
            //ObjectInputStream ois = new ObjectInputStream(fis);
            //读取对象
            //Object obj = ois.readObject();
            //输出
            //System.out.println(obj.toString());
            //ois.close();
            //fis.close();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
