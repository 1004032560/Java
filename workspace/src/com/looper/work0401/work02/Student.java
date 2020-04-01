package com.looper.work0401.work02;

public class Student {

    private int id;
    private String username;
    private int score;

    public Student(int id, String username, int score) {
        this.id = id;
        this.username = username;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
