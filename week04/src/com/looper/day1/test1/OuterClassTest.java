package com.looper.day1.test1;

/**
 *  成员内部类调用
 */

public class OuterClassTest {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        //外部类名.内部类名             使用 外部类对象.new 的方式创建
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.show();
        outerClass.show();

        System.out.println("=================");

        innerClass.printInner();
        outerClass.printOuter();

        System.out.println("=================");

    }

}
