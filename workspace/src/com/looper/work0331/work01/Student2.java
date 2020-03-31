package com.looper.work0331.work01;

/**
 * 懒汉式：时间换空间
 */
public class Student2 {
    private int id;
    private String name;
    private int age;

    private static Student2 student2 = null;

    public static synchronized Student2 getInstance(){
        if (student2==null){
            student2 = new Student2(1001,"looper",18);
        }
        return student2;
    }

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
