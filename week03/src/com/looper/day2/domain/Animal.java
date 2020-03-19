package com.looper.day2.domain;

import sun.plugin2.message.ShowDocumentMessage;

public class Animal {

    protected int age;
    protected String name;

    public void eat(){
        System.out.println("动物吃饭");
    }

    public void run(){
        System.out.println("动物奔跑");
    }

}
