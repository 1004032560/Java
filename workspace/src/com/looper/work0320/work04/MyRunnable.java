package com.looper.work0320.work04;

public class MyRunnable implements Runnable {

    Object object = new Object();

    @Override
    public void run() {
        for (int i=1;i<=52;i=i+2){
            synchronized (object){
                if ("线程1".equals(Thread.currentThread().getName())){
                    System.out.println(Thread.currentThread().getName()+"：打印了i="+i);
                    System.out.println(Thread.currentThread().getName()+"：打印了i="+(i+1));
                }else{
                    System.out.println(Thread.currentThread().getName()+"：打印了i="+(char)(i+64));
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
