package com.looper.day3.test7;

public class GCTest {

    public static void main(String[] args) {

        Object object = new Object();

        // 匿名创建；直接在堆中创建了一个空间，
        // 垃圾回收机制会最先回收：匿名对象
        new Object();

        // GC垃圾回收机制；
        // GC有了多线程的支持，多个任务都有执行机会
        // 而不会产生其他的一些任务被挂起的现象
        while(true){
            new Object();
            System.out.println("创建了一个匿名对象！");
        }


    }

}
