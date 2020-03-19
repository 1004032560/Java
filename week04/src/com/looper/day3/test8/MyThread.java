package com.looper.day3.test8;

/**
 * 对Thread进行继承
 * 对run()方法进行重写
 */

public class MyThread extends Thread {

    public MyThread(String str) {
        super(str);
    }

    @Override
    public void run() {

        for (int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"执行任务！"+i);

            try {
                sleep(1000); //throws不能使用，因为方法重写不能抛出更多（检查异常）异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
