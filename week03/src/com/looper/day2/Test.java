package com.looper.day2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char c = 'a';
        if (c >= 91){
            c = (char) ((int)c - 32);
        }
        System.out.println(c);
    }
}