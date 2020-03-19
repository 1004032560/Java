package com.looper.day2.test4;

public class StringTest2 {

    public static void main(String[] args) {

        //substring();截取字符串操作
        String str1 = "looper@gmaile.com";

        //per@gmaile.com;从0开始
        String str2 = str1.substring(3);
        //r@g;从0开始,不包含最后的字符
        String str3 = str1.substring(5,8);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
