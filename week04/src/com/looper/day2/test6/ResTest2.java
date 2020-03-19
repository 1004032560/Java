package com.looper.day2.test6;

import java.util.regex.Pattern;

public class ResTest2 {

    public static void main(String[] args) {

        //1、邮箱验证的正则表达式
        String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

        //2、准备要验证的字符串
        String str = "10-04_032A5d6@qq.com";

        //3、验证
        boolean flag = Pattern.matches(regex,str);
        System.out.println(flag);

    }

}
