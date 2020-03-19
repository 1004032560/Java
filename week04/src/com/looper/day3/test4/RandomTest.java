package com.looper.day3.test4;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        Random random1 = new Random();

        //int范围内随机产生，结果不确定
        System.out.println(random1.nextInt());
        //int范围内产生，结果[0,n);取不到n
        System.out.println(random1.nextInt(3));



        //Random random2 = new Random(1);
        //System.out.println(random2.nextInt());





    }

}
