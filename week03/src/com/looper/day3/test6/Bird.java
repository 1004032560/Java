package com.looper.day3.test6;

public class Bird implements Jump {
    @Override
    public void fly() {
        System.out.println("小鸟在天上飞");
    }

    @Override
    public void run() {
        System.out.println("小鸟在地上跑");
    }

    @Override
    public void jump() {
        System.out.println("小鸟在地上跳");
    }
}
