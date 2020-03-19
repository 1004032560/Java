package com.looper.day4;

public class Test1 {

    public static void main(String[] args) {

        //方式1 -- 推荐使用
        //int [] source1;

        //方式2 -- []在后边，看起来不明显
        //int source2 [];

        //方式1 -- 只知道数组长度
        //int[] source1 = new int[5];

        //方式2 -- 知道数组数据
        //int[] source1 = new int[]{1,2,3,4,5};

        //方式3 -- 不用new
        //int[] source3 = {1,2,3,4,5};

        int[] source1 = new int[]{1,2,3,4,5};

        //获取数组长度
        int len = source1.length;
        System.out.println("数组长度为："+len);

        //访问数组
        //System.out.println(source1);//输出的是地址

        //System.out.println(source1[1]);//输出的是：2

        //遍历数组，格式1：for循环
        for(int i=0;i<source1.length;i++){
            System.out.print(source1[i]+"\t");
        }

        //遍历数组，格式2：增强for循环
        for(int source:source1){
            System.out.print(source+"\t");
        }


    }

}
