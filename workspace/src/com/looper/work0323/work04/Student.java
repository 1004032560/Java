package com.looper.work0323.work04;

public class Student<E> {

    private int id;
    private String name;
    private E e;

    public Student() {
    }

    public Student(int id, String name, E e) {
        this.id = id;
        this.name = name;
        this.e = e;
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

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", e=" + e +
                '}';
    }
}
