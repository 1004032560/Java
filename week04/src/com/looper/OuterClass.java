package com.looper;

/**
 * 成员内部类
 */

public class OuterClass {

    private int num = 10;
    private int num1 = 11;
    private String nameOuter = "OuterClass";

    public void show(){
        System.out.println("打印外部show方法"+num+"||"+nameOuter);
    }

    public void printOuter(){
        System.out.println("打印外部printOuter方法"+num+"||"+nameOuter);
    }

    //内部类
    public class InnerClass{
        private int num = 20;
        private String nameInner = "InnerClass";


        public void show() {

            System.out.println(num);
            System.out.println(num1);
            System.out.println(OuterClass.this.num);
            System.out.println(this.num);

        }

        public void printInner(){

            printOuter();

        }
    }

}
