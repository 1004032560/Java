package com.looper.work0311.work2;

public interface ILiving {

    //接口中只能放静态公共常量
    public static final int num = 100;

    //public 和 static 可以不用写
    String str = "looper";

    void breath();

}
