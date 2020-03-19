package com.looper.work0311.work2;

/**
 * 使用 implements 对接口进行实现
 * 实现该接口的所有方法，包括接口继承的接口的方法都应该实现
 */

public class Student implements IPeople {
    @Override
    public void think() {
        System.out.println("学生进行思考");
    }

    @Override
    public void study() {
        System.out.println("学生进行学习");
    }

    @Override
    public void eat() {
        System.out.println("学生进行吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生进行睡觉");
    }

    @Override
    public void breath() {
        System.out.println("学生进行呼吸");
    }
}
