package com.looper.day1.test3;

import java.io.*;

public class CopyTest {

    public static void main(String[] args) {

        File file1 = new File("/2233.txt");
        File file2 = new File("/23.txt");

        try {
            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);

            FileReader fr = new FileReader(file2);
            BufferedReader br = new BufferedReader(fr);

            bw.write(br.readLine());

            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}