package com.looper.work0317.work03;

public class CutTest {
    public static void stringSplit(String str, int len) {
        if(null == str) {
            return;
        }
        if(len > str.length()) {
            len = str.length();
        }
        // 将string转换成byte数组
        byte[] buf = str.getBytes();
        //对是否出现截半做分类处理，如果出现了截半情况，则asc码值小于0
        if(buf[len]<0) {
            String result = new String(buf,0,len--);
            System.out.println("出现了截半情况，结果为：" + result);
        } else {
            String result = new String(buf,0,len);
            System.out.println("没有出现截半情况，结果为：" + result);
        }
    }
    public static void main(String[] args) {
        stringSplit("我ABC汉语BDEFG",7);
    }
}
