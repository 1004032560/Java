package com.looper.day1.test5;

import java.io.*;

public class ObjectInputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("E:/looper.txt");

        InputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Object obj = ois.readObject();
        //Student1 student = (Student1) obj;
        //System.out.println(student.toString());
        System.out.println(obj.toString());

    }

}
