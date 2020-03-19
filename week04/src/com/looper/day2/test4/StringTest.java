package com.looper.day2.test4;

public class StringTest {

    public static void main(String[] args) {

        String str1 = "abc";
        //对字符串str1进行拼接，添加上ABC
        //对String操作之后，str1不变，重新在堆中开辟了一个空间
        String str2 = str1.concat("ABC");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============");

        //对str1通过赋值的方式修改后，就改变了
        str1 = "Hello World!";
        System.out.println(str1);
        System.out.println("==============");




    }

}
