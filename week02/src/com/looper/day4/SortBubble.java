package com.looper.day4;

/**
 * 冒泡排序（BubbleSort）
 *
 * 要求：
 * 从小到大排序
 *
 * 方法：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */

public class SortBubble {

    public static void main(String[] args) {
        int[] sources = new int[]{1,2,3,4,5};

        for (int i=0;i<sources.length-1;i++){
            for (int j=0;j<sources.length-i-1;j++){
                if (sources[j]>sources[j+1]){
                    int temp = sources[j];
                    sources[j] = sources[j+1];
                    sources[j+1] = temp;
                }
            }
        }

        System.out.println("从小到大的顺序为：");
        for (int source:sources){
            System.out.print(source+"\t");
        }
    }
}
