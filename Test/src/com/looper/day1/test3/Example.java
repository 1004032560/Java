package com.looper.day1.test3;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String s = "x,yy,123";
        Scanner sc = new Scanner(s);
        while (sc.hasNext()) {
            System.out.println(sc.next() + " ");
        }
    }
}

