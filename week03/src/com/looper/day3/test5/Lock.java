package com.looper.day3.test5;

/**
 * 接口的使用
 */

public interface Lock {

    //接口中只能放静态公共常量
    public static final int num = 100;

    //public 和 static 可以不用写
    String str = "looper";

    //接口中方法只能是公开抽象的
    public abstract void open();

    //public 和 abstract可以不用写
    void show();

    public abstract void lock();

    //接口中的方法全部都是抽象的不能有非抽象方法

}
