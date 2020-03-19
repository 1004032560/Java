package com.looper.day3;

import java.util.Date;

public class Test3 {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1.hashCode());
        System.out.println(date2);

        //比较的是引用地址
        System.out.println(date1==date2);

        //比较的是数据内容
        Boolean flag = date1.equals(date2);
        System.out.println(flag);

    }

}
