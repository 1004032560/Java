package com.looper.day5;

import javax.print.attribute.standard.MediaSizeName;

public class Test1 {

    public static void main(String[] args) {

        //二维数组的三种声明方式

        //方式一：推荐使用
        int [][] nums4;
        //方式二
        int nums5[][];
        //方式三
        int [] nums6[];

        //初始化
        //如果二维长度不给，不是等长的一维数组
        int [][] nums1 = new int[2][];
        //如果二维长度给，等长的一维数组
        int [][] nums2 = new int[3][4];


        //求长度
        System.out.println(nums1.length);//2
        System.out.println(nums2.length);//3

        //访问值
        System.out.println(nums2[0]);//[I@1b6d3586
        System.out.println(nums2[0][2]);//0


    }

}
