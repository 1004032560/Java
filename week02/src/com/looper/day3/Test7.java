package com.looper.day3;
import java.util.Scanner;
public class Test7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int count = scanner.nextInt();
        int sum=0;
        double avg = 0.0;

        for (int i=1;i<=count;i++){

            System.out.println("请输入第"+i+"个学生成绩：");
            int grade = scanner.nextInt();
            sum = sum + grade;
        }

        avg = (double)(sum/count);
        System.out.println("总成绩为："+sum);
        System.out.println("平均分为："+avg);

    }
}
