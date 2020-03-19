package com.looper.work0318.work03;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        int i = 0;

        loop:while(true){
            if ("张三".equals(Thread.currentThread().getName())) {
                if (Account.getMoney()<=0){
                    System.out.println("余额不足以支付，张三取款，余额0元");
                    i++;
                    if (i==6){
                        break loop;
                    }
                }else{
                    System.out.println("张三准备取款,余额为："+Account.getMoney());
                    Account.setMoney(Account.getMoney()-1000);
                    System.out.println("张三取款完成,余额为："+Account.getMoney());
                }
            }else{
                if (Account.getMoney()<=0){
                    System.out.println("余额不足以支付，张三的妻子取款，余额0元");
                    i++;
                    if (i==6){
                        break loop;
                    }
                }else{
                    System.out.println("张三的妻子准备取款,余额为："+Account.getMoney());
                    Account.setMoney(Account.getMoney()-1000);
                    System.out.println("张三的妻子取款完成,余额为："+Account.getMoney());
                }
            }
        }

    }
}
