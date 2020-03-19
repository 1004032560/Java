package com.looper.day3.test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatStringTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy年MM月dd日 hh:mm:ss");

        String str = "2020年11月11日 12:12:12";

        Date date = simpleDateFormat.parse(str);

        System.out.println(date);

    }

}
