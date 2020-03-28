package com.looper.work0327.work02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();

        stuList.add(new Student(1001,"jkl",78,88,68));
        stuList.add(new Student(1001,"qwe",68,76,85));
        stuList.add(new Student(1001,"jkl",79,71,92));
        stuList.add(new Student(1001,"jkl",65,85,88));
        stuList.add(new Student(1001,"jkl",75,56,79));

        try {
            File file = new File("/2233.txt");
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(stuList);

            InputStream is = new FileInputStream(file);

            ObjectInputStream ois = new ObjectInputStream(is);

            System.out.println(ois.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
