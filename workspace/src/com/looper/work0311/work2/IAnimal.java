package com.looper.work0311.work2;

public interface IAnimal extends ILiving {

    //接口中方法只能是公开抽象的
    public abstract void eat();

    //public 和 abstract可以不用写
    void sleep();

}
