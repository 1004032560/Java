package com.looper.work0305;

import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {

        boolean flag = true;

        int [] nums1 = new int []{1,2,3,5,9};

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入要查找的数：");

        int num = sc.nextInt();

        for (int i=0;i<nums1.length;i++){
            if (num==nums1[i]){
                System.out.println("该数存在下标为："+i);
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("该数不存在-1");
        }

    }

}
