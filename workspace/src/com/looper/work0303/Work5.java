package com.looper.work0303;

import java.util.Scanner;

/**
 * 需求说明
 *      商场推出幸运抽奖活动
 * 抽奖规则：
 *      输入顾客的三位会员卡号的，如果各位数字之和大于20，为幸运顾客。
 *      可以获得精美礼品一份！否则不是幸运顾客。谢谢光临！！！
 */

public class Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入三位数的会员卡号：");
        int num = scanner.nextInt();

        /*
        //个位
        int one = num % 10;
        int num1 = (num-one)/10;
        //十位
        int ten = num1 % 10;
        int num2 = (num1-ten)/10;
        //百位
        int hundred = num2 % 10;
        //求和
        int sum = one + ten + hundred;
        */

        //int类型的整数除10以后，不会有小数，所以没必要用减法
        int one = num%10;
        int ten = num/10%10;
        int hunderd = num/100%10;
        int sum = one + ten + hunderd;

        if (sum>20){
            System.out.println("您是幸运顾客。可以获得精美礼品一份！");
        }else{
            System.out.println("谢谢光临！！！");
        }


    }

}
