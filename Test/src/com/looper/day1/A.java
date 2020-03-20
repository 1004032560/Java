package com.looper.day1;

public class A {
    public A(){
        System.out.print("A");
    }
    public static void main(String args[]){
        A a=new A();
        B b=new B();
    }
}
class B extends A{
    public B(){
        System.out.print("B");
    }
}
