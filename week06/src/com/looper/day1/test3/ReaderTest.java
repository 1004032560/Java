package com.looper.day1.test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {

    public static void main(String[] args) {

        File file = new File("E:/2233.txt");

        try {
            FileReader fr = new FileReader(file);
            //fr.read();
            //高效操作
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            System.out.println(str);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
