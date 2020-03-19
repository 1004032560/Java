package com.looper.work0305;

public class Work1 {

    public static void main(String[] args) {

        int [] nums1 = new int []{1,2,3};

        int [] nums2 = {1,2,3};

        int [] nums3 = new int[3];
        nums3[0]=1;
        nums3[1]=2;
        nums3[2]=3;

        System.out.println("请输入muns1的数：");
        for (int source1:nums1){
            System.out.println(source1+"\t");
        }

        System.out.println();
        System.out.println("请输入muns1的数：");
        for (int source2:nums2){
            System.out.println(source2+"\t");
        }

        System.out.println();
        System.out.println("请输入muns1的数：");
        for (int source3:nums3){
            System.out.println(source3+"\t");
        }


    }

}
