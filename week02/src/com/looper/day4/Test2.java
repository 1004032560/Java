package com.looper.day4;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[]{"aa", "bb", "cc", "dd", "ee"};

        //遍历数组5
        for (String name : names) {
            System.out.print(name + "\t");
        }

        //修改name
        for (String name : names) {

            System.out.println("请输入姓名：");


            System.out.print(name + "\t");
        }
    }
}