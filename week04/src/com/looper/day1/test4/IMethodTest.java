package com.looper.day1.test4;

public class IMethodTest {

    public static void main(String[] args) {
        //方式一：匿名内部类
        IMethod iMethod1 = new IMethod() {
            @Override
            public void fun() {
                System.out.println("实现打印！");
            }
        };
        iMethod1.fun();

        //方式二：使用Lambda表达式：()->{}
        IMethod iMethod2 = ()->{System.out.println("实现打印！");};

        iMethod2.fun();

    }

}
