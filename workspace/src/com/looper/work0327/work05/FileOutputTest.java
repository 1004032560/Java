package com.looper.work0327.work05;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {

    public static void main(String[] args) {

        File file = new File("/pet.txt");

        try {
            file.createNewFile();

            String str = "您好！我的名字是欧欧，我是一只狗狗。我的主人是张三。";

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            fos.write(str.getBytes());

            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("写入成功");

    }

}
