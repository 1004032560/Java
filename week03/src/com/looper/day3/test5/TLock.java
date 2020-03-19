package com.looper.day3.test5;

public class TLock implements Lock {

    @Override
    public void show() {
        System.out.println("show方法");
    }

    @Override
    public void open() {
        System.out.println("打开传统锁");
    }

    @Override
    public void lock() {
        System.out.println("关闭传统锁");
    }
}
