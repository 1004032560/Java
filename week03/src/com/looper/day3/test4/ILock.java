package com.looper.day3.test4;

public class ILock extends Lock {

    @Override
    public void open() {
        System.out.println("打开智能锁");
    }

}
