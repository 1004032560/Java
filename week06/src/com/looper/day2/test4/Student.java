package com.looper.day2.test4;

/**
 * Student类单例模式
 */
public class Student {

    private int id;
    private String name;
    private int score;

    /*//1.饿汉式:类加载时,创建对象
    public static Student student = new Student(1001,"looper",98);
    public static Student getInstance(){
        return student;
    }*/

    //2.懒汉式:使用时才去创建唯一的对象
    public static Student student = null;
    // 会出现多线程,不安全,需要实现同步,保证只能创建一个实例对象
    public synchronized static Student getInstance(){
        if (student==null){
            return new Student(1001,"looper",98);
        }
        return student;
    }


    private Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
