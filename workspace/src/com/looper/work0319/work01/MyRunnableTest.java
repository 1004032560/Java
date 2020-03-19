package com.looper.work0319.work01;

public class MyRunnableTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread((() -> {
            for (int i=1;i<=52;i++){
                System.out.println(Thread.currentThread().getName()+"：打印了i="+i);
            }
        }),"线程1");

        Thread thread2 = new Thread((() -> {
            for (int i=65;i<=90;i++){
                System.out.println(Thread.currentThread().getName()+"：打印了i="+(char)i);
            }
        }),"线程2");

        thread1.setPriority(5);
        thread2.setPriority(8);

        thread1.start();
        thread2.start();

    }

}
