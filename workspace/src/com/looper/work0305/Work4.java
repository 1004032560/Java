package com.looper.work0305;

import java.util.Scanner;

public class Work4 {

    public static void main(String[] args) {

        Work4 w4 =new Work4();
        Scanner sc = new Scanner(System.in);
        int [] sources = new int[5];

        loop1:do{
            w4.page();
            System.out.print("请输入选择：");
            int num = sc.nextInt();
            loop2:switch (num){
                case 1:
                    sources = w4.one(sources);
                    break;
                case 2:
                    w4.two(sources);
                    break;
                case 3:
                    w4.three(sources);
                    break;
                case 4:
                    w4.four(sources);
                    break;
                case 5:
                    w4.five(sources);
                    break;
                case 6:
                    w4.six(sources);
                    break;
                case 7:
                    w4.seven(sources);
                    break;
                case 0:
                    System.out.print("是否退出该系统(y/n):");
                    String str = sc.next();
                    if ("y".equals(str)){
                        break loop1;
                    }else {
                        break;
                    }
            }
        }while (true);

    }

    public int[] one(int [] sources){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sources.length; i++) {
            System.out.println("请输入学生成绩:");
            sources[i] = sc.nextInt();
        }
        return sources;
    }

    public void two(int []sources){
        System.out.print("每个学生的成绩为：");
        for (int source:sources){
            System.out.print(source+"\t");
        }
        System.out.println();
    }

    public void three(int []sources){
        int temp = sources[0];
        for (int i=1;i<sources.length;i++){
            if (sources[i]>temp){
                temp = sources[i];
            }
        }
        System.out.println("最高成绩为："+temp);
    }

    public void four(int []sources){
        int temp = sources[0];
        for (int i=1;i<sources.length;i++){
            if (sources[i]<temp){
                temp = sources[i];
            }
        }
        System.out.println("最低成绩为："+temp);
    }

    public void five(int []sources){
        int sum = 0;
        for (int i=0;i<sources.length;i++){
            sum += sources[i];
        }
        System.out.println("总成绩为："+sum);
    }

    public void six(int []sources){
        int sum = 0;
        int avg = 0;
        for (int i=0;i<sources.length;i++){
            sum += sources[i];
        }
        avg = sum/sources.length;
        System.out.println("平均成绩为："+avg);
    }

    public void seven(int []sources){
        for (int i=0;i<sources.length-1;i++){
            for (int j=0;j<sources.length-i-1;j++){
                if (sources[j]<sources[j+1]){
                    int tempData = sources[j];
                    sources[j] = sources[j+1];
                    sources[j+1] = tempData;
                }
            }
        }
        System.out.print("排序结果为：");
        for (int source:sources){
            System.out.print(source+"\t");
        }
        System.out.println();
    }

    public void page(){
        System.out.println("***************************************");
        System.out.println("            学生成绩管理");
        System.out.println("***************************************");
        System.out.println("注意：刚进入系统必须选择1；先输入成绩");
        System.out.println("***************************************");
        System.out.println("1.录入学生成绩");
        System.out.println("2.输出成绩");
        System.out.println("3.输出最高分");
        System.out.println("4.输出最低分");
        System.out.println("5.输出总成绩");
        System.out.println("6.输出平均分");
        System.out.println("7.排序");
        System.out.println("0.退出系统");
    }
}
