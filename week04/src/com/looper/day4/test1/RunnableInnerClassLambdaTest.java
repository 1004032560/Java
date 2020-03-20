package com.looper.day4.test1;

public class RunnableInnerClassLambdaTest {

    public static void main(String[] args) {

        //匿名内部类
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"2233");
            }
        };

        Thread thread1 = new Thread(runnable1,"线程1：");

        thread1.start();

        //Lambda表达式
        /*Runnable runnable2 = ()->{
                System.out.println(Thread.currentThread().getName()+"2233");
        };*/

        Thread thread2 = new Thread(()->
            System.out.println(Thread.currentThread().getName()+"2233")
        ,"线程2：");

        thread2.start();

    }

}
