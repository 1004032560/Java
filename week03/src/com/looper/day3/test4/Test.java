package com.looper.day3.test4;

/**
 * 抽象的使用
 */

public class Test {

    public static void main(String[] args) {
        Lock iLock = new ILock();

        Lock tLock = new TLock();

        iLock.open();

        tLock.open();
    }

}
