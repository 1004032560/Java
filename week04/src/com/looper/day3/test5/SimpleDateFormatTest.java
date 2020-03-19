package com.looper.day3.test5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日 hh:mm:ss");

        Date date = new Date();
        System.out.println(date);
        System.out.println("================");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println("================");

        //Date格式转换
        String s1 = simpleDateFormat.format(date);
        System.out.println(s1);
        System.out.println("================");

        //calendar格式转换
        //先转成Date类型
        Date dateCalendar = calendar.getTime();
        String s2 = simpleDateFormat.format(dateCalendar);
        System.out.println(s2);

    }

}
