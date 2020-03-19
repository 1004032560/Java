package com.looper.day2.test5;

public class StringTest2 {

    public static void main(String[] args) {

        String str = "looper@gmail.com";

        //求字符串长度
        System.out.println(str.length());

        //判断是否以Looper开头
        boolean flag1 = str.startsWith("Looper");
        System.out.println("是否以Looper开头:"+flag1);

        //判断是否以@gmail.com结尾
        boolean flag2 = str.endsWith("@gmail.com");
        System.out.println("是否以@gmail.com结尾:"+flag2);

    }

}
