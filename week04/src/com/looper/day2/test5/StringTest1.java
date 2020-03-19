package com.looper.day2.test5;

public class StringTest1 {

    public static void main(String[] args) {

        int num = 12;
        System.out.println(num+2);

        //类型转换：将int类型转换为String类型
        String str = String.valueOf(num);
        System.out.println(str);
        System.out.println(str+2);

    }

}
