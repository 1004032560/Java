package com.looper.day1.test3;

public class Student {

    private int id;
    private int name;
    private String address;//属性如果没有get或者set方法，内省机制则不会检测

    public Student() {
    }

    public Student(int id, int name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", address='" + address + '\'' +
                '}';
    }
}
