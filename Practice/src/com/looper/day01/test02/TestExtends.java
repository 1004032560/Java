package com.looper.day01.test02;

/**
 *
 * 实例化一个类的时候 会最先调用他们父类的构造方法
 *
 * 子类如果没有使用super()调用父类的相应参数的构造方法
 * 则子类会默认继承父类的无参构造
 *
 * 如果父类没有无参构造，子类也没有使用super()调用父类构造参数
 * 则会报错
 *
 * 所以在实例化B的时候 先实例化A 再实例化B
 *
 */

public class TestExtends {

    public static void main(String[] args) {

        System.out.println("无参数构造");
        //A a1 = new A();
        //B b1 = new B();

        System.out.println();

        System.out.println("单个参数构造");
        A a2 = new A(1);
        B b2 = new B(2);

        System.out.println();

        System.out.println("两个参数构造");
        A a3 = new A(1,"AA");
        B b3 = new B(2,"BB");

    }

}
