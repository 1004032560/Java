package com.looper.day1.test3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

    public static void main(String[] args) {

        File file = new File("E:/2233.txt");

        try {
            FileWriter fw = new FileWriter(file);
            //高效操作
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Hello world!");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
