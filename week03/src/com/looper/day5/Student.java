package com.looper.day5;

public class Student {

    private int id;
    private String name;
    public static int count = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void showCount(){
        System.out.println("学生个数是："+count);
    }

    public static void main(String[] args) {
        showCount();
    }

}
