package com.looper.day1.test5;

import java.io.*;

public class ObjectOutputStreamTest {

    public static void main(String[] args) throws IOException {

        File file = new File("E:/looper.txt");

        Student1 student = new Student1(1001,"looper",18,"q123");

        OutputStream os = new FileOutputStream(file,false);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(student);

        oos.close();
        os.close();

    }

}
