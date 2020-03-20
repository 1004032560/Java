package com.looper.day1.test1;

public class ClassTest {

    public static void main(String[] args) {

        //方式一：
        Class Class1 = Student.class;
        System.out.println(Class1);

        //方式二：
        Student student = new Student();
        Class Class2 = student.getClass();
        System.out.println(Class2);

        //方式三：
        try {
            Class Class3 = Class.forName("com.looper.day1.test1.Student.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
