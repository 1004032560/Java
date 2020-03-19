package com.looper.day3.test5;

import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        System.out.println(date1.getYear());



        //long类型的整数，推断出，当前时间是多少,
        // 从Jan 01 08:00:00 CST 1970算起
        //Date date2 = new Date(1000000000);
        //System.out.println(date2);

    }

}
