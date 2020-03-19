package com.looper.day3.test4;

public abstract class Lock {

    public abstract void open();

    public void show(){
        System.out.println("我是一把loop锁");
    }

    //抽象类中的方法可以没有抽象方法

}
