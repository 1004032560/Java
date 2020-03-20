package com.looper.day6.practice1;

public class Test2 {

    public static void main(String[] args) {

        SynchronizedTest2 synchronizedTest2 = new SynchronizedTest2();
        Thread thread1 = new Thread(synchronizedTest2,"售票员1");
        Thread thread2 = new Thread(synchronizedTest2,"售票员2");

        thread1.start();
        thread2.start();

    }

}
