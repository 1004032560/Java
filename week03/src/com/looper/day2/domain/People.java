package com.looper.day2.domain;

import com.sun.deploy.util.VersionID;

public class People {

    private int id;
    protected String name;
    private int age;

    //无参构造
    public People(){
        System.out.println("父类无参构造方法！！！");
    }

    //单个参构造方法
    public People(String name){
        this.name = name;
        System.out.println("父类单个参数的构造方法+++");
    }

    //三参构造方法
    public People(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("父类三个参数的构造方法。。。");
    }

    public void show(){
        System.out.println("id:"+id+"name:"+name+"age:"+age);
    }

}
