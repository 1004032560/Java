package com.looper.day5;

public class Test6 {

    public static void main(String[] args) {

        //可变与不可变

        String str = "abc";

        System.out.println("拼接之前的str字符串："+str);

        //操作，在str之后拼接上"123"字符串
        //拼接是新开辟了空间，复制了一个str，将"123"拼接在后边

        System.out.println(str.concat("123"));

        System.out.println("拼接之后的str字符串："+str);

    }


}
