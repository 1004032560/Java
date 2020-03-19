package com.looper.day2.test6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 判断邮箱格式是否合法
 */
public class ResTest1 {

    public static void main(String[] args) {

        //1、邮箱验证的正则表达式
        String regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

        //2、将正则表达式编译成Pattern
        Pattern pattern = Pattern.compile(regex);

        //3、准备要验证的字符串
        String str = "10-04_032A5d6@qq.com";

        //4、使用Pattern对象生成匹配器
        Matcher matcher = pattern.matcher(str);

        //5、使用匹配器验证字符串
        Boolean flag = matcher.matches();
        System.out.println(flag);

    }

}
