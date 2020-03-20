package com.looper.day1.test3;

//检查接口是不是函数式接口
@FunctionalInterface
public interface IFly {

    String fly(String foot);

    //void run(String foot);

    default void run(){
        System.out.println("跑起来！");
    }

}
