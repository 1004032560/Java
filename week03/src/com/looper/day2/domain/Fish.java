package com.looper.day2.domain;

public class Fish extends Animal {

    private String water;


    public void swim(){
        System.out.println("鱼会游泳");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃鱼食");
    }
}
