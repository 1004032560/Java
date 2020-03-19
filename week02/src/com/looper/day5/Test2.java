package com.looper.day5;

public class Test2 {

    public static void main(String[] args) {

        //如果第二个维度的长度没有给，此方式遍历数组时，会出现空指针异常
        int [][] nums1 = new int[2][3];

        //求长度
        System.out.println("一维的长度"+nums1.length);// 2

        //访问值
        System.out.println(nums1);// [I@1b6d3586


        System.out.println(nums1[0]);
        System.out.println(nums1[1]);



        //赋值
        nums1[0] = new int[]{1,2,3};
        System.out.println("二维的长度"+nums1[0].length);// 3

        nums1[1] = new int[]{1,2,3,4,5};
        System.out.println("二维的长度"+nums1[1].length);// 5

        //遍历
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j<nums1[i].length;j++)
                System.out.println(nums1[i][j]+"\t");
        }

    }

}
