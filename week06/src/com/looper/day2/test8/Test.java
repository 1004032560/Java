package com.looper.day2.test8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        //创建一个代理对象 参数1：类加载器；参数2：class[]
        Object obj = Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{Subject.class},
        new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                method.invoke(new RealSubject(),args);
                return null;
            }
        });

        //向下造型
        Subject subject = (Subject) obj;
        subject.show();

    }

}
