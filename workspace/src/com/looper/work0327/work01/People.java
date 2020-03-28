package com.looper.work0327.work01;

import java.io.Serializable;

public class People implements Serializable {

    private int id;
    private String name;
    private int age;
    private String address;

    public People(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


}
