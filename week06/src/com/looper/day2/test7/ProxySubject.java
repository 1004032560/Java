package com.looper.day2.test7;

public class ProxySubject implements Subject{

    private RealSubject realSubject = new RealSubject();

    @Override
    public void show() {
        realSubject.show();
        //System.out.println("代理的对象的show方法。。。");
    }
}
