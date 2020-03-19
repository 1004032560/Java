package com.looper.day3.test4;

public class TLock extends Lock {

    @Override
    public void open() {
        System.out.println("打开传统锁");
    }
}
