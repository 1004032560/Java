package com.looper.day2;

public class Test1 {

    //声明变量-全局变量=成员变量
    static int num;
    static boolean flag;
    static char a;

    public static void main(String[] args) {

        //声明变量-局部变量;方法中的变量为局部变量;
        //局部变量如果要进行使用必须进行初始化
        //int num = 100;
        //boolean flag = true;

        //静态方法：static修饰的方法
        //静态的方法只能访问静态方法
        System.out.println(num);
        System.out.println(flag);
        System.out.println(a);


    }

}
