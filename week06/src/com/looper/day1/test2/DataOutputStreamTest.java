package com.looper.day1.test2;

import java.io.*;

public class DataOutputStreamTest {

    public static void main(String[] args) {

        File file = new File("/2233.txt");

        try {
            OutputStream os = new FileOutputStream(file,true);//实现追加文件的写入信息
            DataOutputStream dos = new DataOutputStream(os);
            String str = "hello";

            dos.writeDouble(3.14);
            dos.writeUTF(str);

            os.flush();
            //后打开的先关闭
            dos.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
