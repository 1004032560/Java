package com.looper.day1.test3;

/**
 * 匿名内部类
 */

public class IFlyTest {

    public static void main(String[] args) {

        String foot1 = "double foot1";
        String foot2 = "double foot2";

        //如果只需要创建一个对象，就不需要写一个单独的Bird类
        IFly iFly1 = new IFly() {
            @Override
            public String fly(String foot) {
                return foot1+"鸟在天上飞！";
            }

        };

        System.out.println(iFly1.fly(foot1));

        //使用Lambda表达式简化匿名内部类
        IFly iFly2 = (String foot)->{
            System.out.println("鸟在天上飞！");
            return foot+",123";
        };

        System.out.println(iFly2.fly(foot2));

        iFly2.run();

    }

}
