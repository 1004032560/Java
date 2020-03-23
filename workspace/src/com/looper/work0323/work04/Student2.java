package com.looper.work0323.work04;

public class Student2 {

    private int id;
    private String name;
    private Object object;

    public Student2() {
    }

    public Student2(int id, String name, Object object) {
        this.id = id;
        this.name = name;
        this.object = object;
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

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", object=" + object +
                '}';
    }
}
