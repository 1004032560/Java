package com.looper.day3;

public class MathTest1 {

    public static void main(String[] args) {

        //圆周率的值
        double num = Math.PI;

        //求绝对值abs()
        int abs1 = Math.abs(-1);
        double abs2 = Math.abs(-2.50);
        System.out.println("绝对值："+abs1);
        System.out.println("绝对值："+abs2);

        //向上取整ceil()
        double ceil = Math.ceil(4.5);
        System.out.println("向上取整"+ceil);

        //向下取整floor()
        double floor = Math.floor(4.9);
        System.out.println("向下取整"+floor);

        //最大值max()
        int max = Math.max(8,6);
        System.out.println("最大值："+max);

        //最小值min()
        double min = Math.min(1.2,65.12);
        System.out.println("最小值："+min);


        //随机数random(); 大于等于0.0，小于1.0
        // [0,1)
        double random = Math.random();
        System.out.println("随机数："+random);

        //四舍五入
        double round = Math.round(2.3);
        System.out.println("四舍五入："+round);

        //随机产生1-3的整数
        for (int i=0;i<10;i++){
            System.out.println((int)(Math.random()*3+1));
        }

    }

}
