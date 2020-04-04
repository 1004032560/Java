package com.looper.day1.test1;

public class Example implements Runnable {
    public static void main(String args[]) {
        Example ex1 = new Example();
        Thread t1 = new Thread(ex1);
        t1.start();
    }

    public void run() {
        System.out.print("pong");
    }

    /*void run() {
        System.out.print("pong");
    }*/
}