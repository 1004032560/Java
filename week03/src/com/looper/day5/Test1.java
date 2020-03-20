package com.looper.day5;

public class Test1 {

    public static void main(String[] args) {

        Student student1 = new Student(1001,"zl");
        System.out.println("学生个数是："+student1.count);

        Student student2 = new Student(1001,"zl");
        System.out.println("学生个数是："+student2.count);

        Student student3 = new Student(1001,"zl");
        //通过对象直接调用类成员
        System.out.println("学生个数是："+student3.count);

        Student.showCount();//通过类名调用
        student1.showCount();//通过类实例调用

    }

}