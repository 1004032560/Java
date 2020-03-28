package com.looper.day1.test4;

import java.io.Serializable;

//对象需要实现序列化
public class People implements Serializable {

    private int id;
    private String name;
    private int age;
    private String sex;

    public People(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
