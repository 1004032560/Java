package com.looper.day1.thread;

public class ThreadLocalTest2 {

    static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName+" : "+threadLocal.get());
                threadLocal.set(0);
                System.out.println(threadName+" : "+threadLocal.get());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName+" : "+threadLocal.get());
                threadLocal.set(1);
                System.out.println(threadName+" : "+threadLocal.get());
            }
        });

        thread1.start();
        thread2.start();

    }

}
