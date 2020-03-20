package com.looper.day5.test3;

public class Resource {

    public synchronized void f1(){
        //synchronized (new Object()){
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+":i="+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        //}
    }

    public synchronized void m1(){
        synchronized (new Object()) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":i=" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        //synchronized方法锁的是一个对象，只有f1执行完了才会执行m1
        Resource resource = new Resource();

        Thread thread1 = new Thread(() -> {
                resource.f1();
        });

        Thread thread2 = new Thread(() -> {
                resource.m1();

        });

        thread1.start();
        thread2.start();

    }

}
