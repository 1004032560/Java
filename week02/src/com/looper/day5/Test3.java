package com.looper.day5;

public class Test3 {

    public static void main(String[] args) {

        //基本类型


        int num = 100;

        //自动装箱；装成一个对象
        Integer i1 = num;

        System.out.println(i1);
        System.out.println(i1.toString());

        //自动拆箱
        int num2 = i1;

        System.out.println(num2);


        //new 的时候会开辟新空间，新的地址
        //Integer i1 = new Integer(2);
        //Integer i2 = new Integer(2);




        /*

        //比较的是地址
        System.out.println("i1==i2"+(i1==i2));// false

        Integer i3 = 12;
        Integer i4 = 12;

        System.out.println(i3);
        System.out.println("i3==i4"+(i3==i4));// true


        //只有在字节范围（-128到127）内的时候才会用到常量池；
        // 超出这个范围，他就不会用到常量池，没有new的话，他也会去堆中自动开辟空间
        Integer i5 = 129;
        Integer i6 = 129;

        System.out.println(i5);
        System.out.println("i5==i6"+(i5==i6));// false


         */

    }

}
