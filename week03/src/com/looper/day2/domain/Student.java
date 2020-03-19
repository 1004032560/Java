package com.looper.day2.domain;

public class Student extends People {

    private int source;

    //调用了父类无参构造方法
    public Student(int source) {
        this.source = source;
        System.out.println("子类单参数构造方法");
    }

    //无参构造
    public Student(){
        System.out.println("子类无参构造方法");
    }

    public Student(String name,int source) {
        super(name);
        this.source = source;
        System.out.println("子类两个参数构造方法");
    }


    //调用了三个参数的构造方法
    public Student(int id, String name, int age, int source) {
        super(id, name, age);
        this.source = source;
        System.out.println("子类三个参数构造方法");
    }

    @Override
    public void show(){
        super.show();
        System.out.println("source:"+source);
    }

}
