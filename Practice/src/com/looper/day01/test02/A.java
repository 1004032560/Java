package com.looper.day01.test02;

public class A {

    private int num;
    private String name;

    public A() {
        System.out.println("A类无参");
    }

    public A(int num) {
        this.num = num;
        System.out.println("A类int类型参数"+num);
    }

    public A(String name) {
        this.name = name;
        System.out.println("A类String类型参数"+name);
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("A类int和String类型参数"+num+":"+name);
    }
}
