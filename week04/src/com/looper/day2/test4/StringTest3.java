package com.looper.day2.test4;

public class StringTest3 {

    public static void main(String[] args) {
        //substring();截取字符串操作
        String str1 = "1004032560looper@gmaile.com";

        //查找"l"在字符串中第一次出现的位置
        int position1 = str1.indexOf("loo");
        //查找"0"在字符串中第一次出现的位置，从第2个下标开始找，包括2号下标
        int position2 = str1.indexOf("60",4);

        System.out.println("\"loo\"在str1中第一次出现的位置:"+position1);
        System.out.println("第4个字符开始,\"60\"在str1中第一次出现的位置:"+position2);
        System.out.println("========================================");

        //查找"l"在字符串str1中最后一次出现的位置
        int position3 = str1.lastIndexOf("l");
        //查找"0"在字符串中第一次出现的位置，从第2个下标开始找，包括2号下标
        int position4 = str1.lastIndexOf("0",2);

        System.out.println("倒数,\"l\"在str1中第一次出现的位置:"+position3);
        System.out.println("倒数第4个字符开始,\"0\"在str1中第一次出现的位置:"+position4);

    }

}
