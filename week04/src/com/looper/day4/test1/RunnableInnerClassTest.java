package com.looper.day4.test1;

public class RunnableInnerClassTest {

    static boolean flag = true;

    //静态内部类
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("静态内部类");
        }
    }

    public static void main(String[] args) {

        //方法内部类
        class MyRunnable implements Runnable{
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"方法内部类");

                }
            }
        }

        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable,"TestInnerClass线程1:");

        thread1.start();

        Thread thread2 = new Thread(myRunnable,"TestInnerClass线程2:");

        thread2.start();


        thread1.setPriority(2);
        thread2.setPriority(8);

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());


        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("here");
        }*/

        thread1.interrupt();


    }
}
