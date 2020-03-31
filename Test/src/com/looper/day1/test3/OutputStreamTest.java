package com.looper.day1.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 测试OutputStream流在执行写操作时，没有文件，是否会自动创建
 */
public class OutputStreamTest {

    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("E:/2233.txt", false);

        os.close();
    }

}
