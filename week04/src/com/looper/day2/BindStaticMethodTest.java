package com.looper.day2;

/**
 * 绑定静态方法
 */

public class BindStaticMethodTest {

    public static void main(String[] args) {
        IB ib = A::show;
        ib.print();
    }

}

class A{
     public static void show(){
        System.out.println("A类的静态方法");
    }
}

interface IB{
    void print();
}