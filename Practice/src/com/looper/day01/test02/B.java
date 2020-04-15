package com.looper.day01.test02;

public class B extends A {

    private int num;
    private String name;

    /*public B() {
        System.out.println("B类无参");
    }*/

    public B(int num) {
        this.num = num;
        System.out.println("B类int类型参数"+num);
    }

    public B(String name) {
        super(name);
        this.name = name;
        System.out.println("B类String类型参数"+name);
    }

    public B(int num, String name) {
        super(num,name);
        this.num = num;
        this.name = name;
        System.out.println("B类int和String类型参数"+num+":"+name);
    }

}
