package com.looper.day6.practice1;

public class Test1 {

    public static void main(String[] args) {

        SynchronizedTest1 synchronizedTest1 = new SynchronizedTest1();
        Thread thread1 = new Thread(synchronizedTest1,"售票员1");
        Thread thread2 = new Thread(synchronizedTest1,"售票员2");

        thread1.start();
        thread2.start();

    }

}
