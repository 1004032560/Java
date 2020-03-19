package com.looper.day5;

public class Test5 {
    public static void main(String[] args) {

        String str1 = new String ("abc");
        String str2 = new String ("abc");

        //比较的是地址，结果false
        System.out.println("比较结果："+(str1==str2));

        //没有用到new时，String类型的值就会放到常量池中
        String str3 = "abc";
        String str4 = "abc";

        //在常量池中使用，结果true
        System.out.println("比较结果："+(str3==str4));

    }
}
