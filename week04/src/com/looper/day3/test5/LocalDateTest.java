package com.looper.day3.test5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {

    public static void main(String[] args) {
        //获取方式
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //获取方式
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //获取方式
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println(localDateTime);
    }

}
