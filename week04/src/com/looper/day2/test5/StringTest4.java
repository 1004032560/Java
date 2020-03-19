package com.looper.day2.test5;

public class StringTest4 {

    public static void main(String[] args) {
        String str = "123#poi#<>??#44说的";

        String[] strs1 = str.split("#");
        String[] strs2 = str.split("#",1);

        for (String s : strs1) {
            System.out.println(s);
        }
        System.out.println("==========");
        for (String s : strs2) {
            System.out.println(s);
        }

    }

}
