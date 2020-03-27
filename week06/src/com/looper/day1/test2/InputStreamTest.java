package com.looper.day1.test2;

import java.io.*;

public class InputStreamTest {

    public static void main(String[] args) {

        File file = new File("/2233.txt");

        InputStream is = null;
        try {

            is = new FileInputStream(file);

            byte[] buf = new byte[100];
            int num = is.read(buf);
            System.out.println("读取到的有效的数据长度："+num);

            //将byte转化为字符串
            String str = new String(buf,0,num);
            System.out.println(str);
            System.out.println("读取完毕");
            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
