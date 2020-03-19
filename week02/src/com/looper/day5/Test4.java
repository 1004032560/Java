package com.looper.day5;

public class Test4 {

    public static void main(String[] args) {

        String str = new String ("abcDEF");

        //大写字母；
        System.out.println(str.toUpperCase());

        //小写字母；
        System.out.println(str.toLowerCase());

        //比较是否相等
        System.out.println("比较结果："+("abcdef".equals(str)));//false

        //比较时忽略大小写
        System.out.println("比较结果："+("abcdef".equalsIgnoreCase(str)));//true


    }

}
