package com.looper.day2.test4;

public class Student extends People {

    private int source;

    public Student(int id, String name, int age, int source) {
        super(id, name, age);
        this.source = source;
    }

}
