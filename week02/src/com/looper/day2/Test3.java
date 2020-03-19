package com.looper.day2;

public class Test3 {

    public static void main(String[] args) {

        //float f1 = 1.5; 报错是因为 1.5 在没有限制的情况下默认为double类型
        double d1 = 1.5;
        //强制类型转换
        float f1 = (float) d1;

        float f2 = 1.5f;
        //自动类型转换
        double d2 = f2;

        int num = 1000;
        float f3 = num;
        System.out.println(f3);

        byte b1 = (byte) num;



    }

}
