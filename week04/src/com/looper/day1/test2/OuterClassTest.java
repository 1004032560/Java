package com.looper.day1.test2;

public class OuterClassTest {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        innerClass.show();
        outerClass.show();

        System.out.println("=================");

        innerClass.printInner();
        outerClass.printOuter();
        System.out.println("=================");

    }

}
