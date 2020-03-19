package com.looper.day2.test1;

/**
 * 绑定构造方法
 */

public class BindConstructorTest {
    public static void main(String[] args) {
        IF iF = E::new;
        E e = iF.createE(1001,"张三");
        e.print();
    }
}

class E{
    private int id;
    private String name;

    public E(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("E类的构造方法被调用");
    }

    public void print(){
        System.out.println("E类的print方法被调用");
    }
}

interface IF{
    E createE(int id,String name);
}