package com.looper.work0318.work01;

public class Runnable1Test {

    public static void main(String[] args) {

        Runnable1 runnable1 = new Runnable1();

        Thread thread = new Thread(runnable1,"线程1");

        thread.start();

    }

}
