package com.looper.day3.test5;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {

        //Calendar 是抽象类，不能实例化
        //Calendar calendar = new Calendar();

        //Calendar 是抽象类，方法是static静态的，通过类名直接调用
        Calendar calendar = Calendar.getInstance();

        //System.out.println(calendar);

        System.out.println();

        Date date = calendar.getTime();
        System.out.println(date);

        Calendar calendar1 = Calendar.getInstance();

        //格式转换之后，才能输出，否则会报错
        Date date1 = calendar1.getTime();
        System.out.println(date1);

    }

}
