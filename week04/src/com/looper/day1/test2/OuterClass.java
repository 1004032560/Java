package com.looper.day1.test2;

/**
 * 静态内部类
 */

public class OuterClass {

    private static int numOuter = 10;
    private String nameOuter = "JKL";

    public static void show(){
        System.out.println("打印外部show方法"+numOuter);
    }

    public void printOuter(){
        System.out.println("打印外部printOuter方法"+numOuter+"||"+nameOuter);
    }


    //静态内部类
    public static class InnerClass{
        private int numInner;
        private static String nameInner;


        public static void show(){

            OuterClass.show();
            //System.out.println("打印内部show方法"+numInner+"||"+nameInner);
            System.out.println("调用外部类属性"+numOuter);
        }

        public void printInner(){
            show();

            System.out.println("打印内部printInner方法"+numInner+"||"+nameInner);
            System.out.println("调用外部类属性"+OuterClass.numOuter);
        }
    }

}
