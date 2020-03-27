package com.looper.day1.test2;

import java.io.*;

public class FileCopyTest {

    public static void main(String[] args) {

        File dataFile = new File("/2233.txt");
        File copyFile = new File("/23.txt");

        try {
            copyFile.createNewFile();
            byte[] buf = new byte[100];

            //读文件
            InputStream is = new FileInputStream(dataFile);
            int num = is.read(buf);
            String str = new String(buf,0,num);
            System.out.println(str);
            System.out.println();
            System.err.println(str);

            //写文件
            OutputStream os = new FileOutputStream(copyFile);
            os.write(buf);

            //关闭字节流
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
