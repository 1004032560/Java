package com.looper.day2.test5;

public class StringTest3 {

    public static void main(String[] args) {

        String str = "  aA    looper@gmail.com  ";

        //将String类型转换成字节数组
        byte[] buf = str.getBytes();
        for (byte b : buf) {
            System.out.println(b);
        }

        //去除字符串首末的空格
        String str1 = str.trim();
        System.out.println(str1);

    }

}
