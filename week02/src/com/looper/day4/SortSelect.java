package com.looper.day4;

/**
 * 选择排序（SelectSort）
 *
 * 要求：
 * 从小到大排序
 *
 * 方法：
 * 首先选择第一个元素，用第一个元素和其他的元素比较大小
 * 如果发现有比第一个元素小的数，就把他两的数据交换
 *
 */

public class SortSelect {

    public static void main(String[] args) {

        int[] sources = new int[]{9,2,6,1,5};

        for (int i=0;i<sources.length-1;i++){

            //定义一个临时变量，将第一个数的下标赋值给他，然后和后边每一个数进行比较
            int temp = i;

            //遍历比较大小
            for (int j=i+1;j<sources.length;j++){
                //如果发现了一个比第一个数还小的值
                if (sources[temp]>sources[j]){
                    //将该发现的数的下标赋给下标的临时变量
                    temp = j;
                }
            }

            //如果现在的下标不是刚开始赋值的下标数了，则将这两项的值进行交换
            if (temp != i){
                //定义了一个临时变量，暂时记录交换的数据
                int tempData = sources[temp];
                sources[temp] = sources[i];
                sources[i] = tempData;
            }
        }

        //输出结果
        System.out.println("从小到大的顺序为：");
        for (int source:sources){
            System.out.print(source+"\t");
        }

    }
}
