package com.looper.day2.test4;

public class StringTest1 {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";
        System.out.println("==比较："+(str1==str2));
        System.out.println("equals比较："+str1.equals(str2));
        System.out.println("===========");

        String str3 = new String("123");
        String str4 = new String("123");
        System.out.println("==比较："+(str3==str4));
        System.out.println("equals比较："+str3.equals(str4));
        System.out.println("===========");

    }

}
