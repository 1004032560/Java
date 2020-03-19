package com.looper.day2.test2;

import java.util.Scanner;

public class ExceptionTest {

    public void input() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int score = input.nextInt();
        if (score>100||score<0){

            System.out.println("1成绩必须是0-100");
            throw new Exception();

        }
    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.input();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("成绩必须是0-100");
        }
    }

}
