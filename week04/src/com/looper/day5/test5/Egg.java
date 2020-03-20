package com.looper.day5.test5;

public class Egg {
    private boolean flag = false;
    //公用的锁
    static Object obj = new Object();

    //匿名内部类
    Thread get = new Thread(){
        @Override
        public void run() {
            while(true){
                if(flag){
                    System.out.println("人获取了一个鸡蛋");
                    flag=false;
                }else{
                    System.out.println("等待生产");
                    //注意：锁不能是this，因为匿名内部类各自有自己的this
                    //注意：通信一次就够了
                    //synchronized (this){
                    synchronized (obj){
                        try {
                            obj.wait();
                            //this.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    };

    Thread set = new Thread(){
        @Override
        public void run() {
            while(true){
                if(!flag){
                    System.out.println("产生一个");
                    flag=true;
                    //synchronized (this){
                    synchronized (obj){
                        obj.notify();
                        //this.notify();
                    }
                    //注意：有等待时间
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("等待消费");
                }
            }
        }
    };

    public static void main(String[] args) {
        Egg egg = new Egg();

        egg.set.start();
        egg.get.start();

    }
}
