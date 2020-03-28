package com.looper.day1.test4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {

        File file = new File("/2233.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);

            //对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            People people = new People(1001,"jkl",19,"女");

            oos.writeObject(people);

            oos.close();
            System.err.println();

            String str = "Metallica";
            System.out.println(str.substring(6));
            str.length();
            System.out.println("string".endsWith(""));



    } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
