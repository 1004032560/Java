package com.looper.day1.test1;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        //方式一：
        Class class1 = Student.class;
        System.out.println(class1);

        //方式二：
        Student student = new Student();
        Class class2 = student.getClass();
        System.out.println(class2);

        //方式三：
        Class class3 = Class.forName("com.looper.day1.test1.Student");
        System.out.println(class3);

    }
}
