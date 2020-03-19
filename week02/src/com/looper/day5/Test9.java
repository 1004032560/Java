package com.looper.day5;

public class Test9 {

    public static void main(String[] args) {

        int [][] nums = new int[3][2];

        int temp = 0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = temp++;
            }
        }

        //数组在栈中的地址
        System.out.println(""+nums);

        //在一维中存放二维数据的地址
        System.out.println(""+nums[0]);
        System.out.println(""+nums[1]);
        System.out.println(""+nums[2]);

        //数据
        System.out.println(""+nums[0][0]);
        System.out.println(""+nums[0][1]);
        System.out.println(""+nums[1][0]);
        System.out.println(""+nums[1][1]);
        System.out.println(""+nums[2][0]);
        System.out.println(""+nums[2][1]);

    }

}
