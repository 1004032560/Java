package com.looper.day1.test2;

import java.io.*;

public class OutputStreamTest {

    public static void main(String[] args) {

        File file = new File("/2233.txt");

        try {
            //OutputStream os = new FileOutputStream(file);//覆盖之前的内容
            OutputStream os = new FileOutputStream(file,true);//实现追加文件的写入信息
            String str = "123456879";
            os.write(str.getBytes());
            os.flush();//刷新字节流
            os.close();//关闭字节流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
