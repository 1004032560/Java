package com.looper.work0311.work3.domain;

public class Student {

    private int sid;
    private String name;
    private int age;
    private int score;

    public Student() {
    }

    public Student(int sid, String name, int age, int score) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.score = score;
        //this.students = students;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void show(){

        System.out.println("学生ID:"+sid+"   学生姓名:"+name+"   学生年龄"+age+"   学生分数:"+score);

    }

}
