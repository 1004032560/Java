package com.looper.day5.test5;

public class Egg1 {

    //标记鸡蛋有无的状态
    int num = 0;

    //两个资源进来是两个锁，但是这是同一件事
    //所以创建同一个公用的锁对象，来控制这个两个对象
    Object object = new Object();

    //人的线程  取鸡蛋
    Thread th1 = new Thread(){
        @Override
        public void run() {
            while(true){
                if (num==0){//没有鸡蛋
                    System.out.println("当前没有鸡蛋，等待.....");
                    synchronized(object){
                        //在同步块中才可以通讯
                        //等待，用锁对象调用wait()，就可以进入等待的方法
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }else{
                    System.out.println("人获取了一个鸡蛋");
                    num=0;
                }
            }
        }
    };

    //鸡的线程  产生鸡蛋
    Thread th2 = new Thread(){
        @Override
        public void run() {
            while(true){
                if (num==0){//没有鸡蛋
                    num=1;
                    System.out.println("鸡生产了一个鸡蛋");

                    //唤醒等待的线程
                    synchronized(object){
                        object.notify();
                    }
                    //休眠
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };


    public static void main(String[] args) {
        Egg1 egg1 = new Egg1();
        egg1.th1.start();
        egg1.th2.start();
    }
}
