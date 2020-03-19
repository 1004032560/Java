package com.looper.work0305;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        int [] sources = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        //录入学生成绩
        for (int i=0;i<sources.length;i++){
            System.out.print("请输入第"+(i+1)+"学生成绩:");
            while (true){
                sources[i] = sc.nextInt();
                if (sources[i]<0 || sources[i]>100){
                    System.out.print("请重新输入第"+(i+1)+"学生成绩:");
                }else{
                    break;
                }
            }
            sum += sources[i];
        }

        System.out.println("5个学生的成绩和为"+sum);

        System.out.println("5个学生的平均值为"+(sum/5));

        //输出学生成绩
        System.out.print("5个学生的成绩分别为：");
        for (int source1:sources){
            System.out.print(source1+"\t");
        }

    }

}
