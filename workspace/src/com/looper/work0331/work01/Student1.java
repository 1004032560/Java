package com.looper.work0331.work01;

/**
 * 饿汉式：空间换时间
 */
public class Student1 {

    private int id;
    private String name;
    private int age;

    private static Student1 student1 = new Student1(1001,"looper",18);

    public static Student1 getInstance(){
        return student1;
    }

    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
