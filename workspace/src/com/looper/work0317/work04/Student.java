package com.looper.work0317.work04;

public class Student {
    String id;
    String name;
    String  score;

    public Student() {
    }

    public Student(String id, String name, String score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public void show(){
        System.out.println("学号:"+id+"姓名:"+name+"分数:"+score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
