package com.looper.day5;

public class Test7 {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("abc");
        System.out.println("拼接之前的s1字符串："+s1);

        //拼接操作
        System.out.println(s1.append("123"));

        System.out.println("拼接之后的s1字符串："+s1);
    }

}
