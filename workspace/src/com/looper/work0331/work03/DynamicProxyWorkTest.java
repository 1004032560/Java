package com.looper.work0331.work03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyWorkTest {

    public static void main(String[] args) {

        Object obj = Proxy.newProxyInstance(DynamicProxyWorkTest.class.getClassLoader(), new Class[]{Work.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //被代理的对象
                method.invoke(new RealWork(),args);

                return null;
            }
        });

        //向下造型
        Work work = (Work)obj;
        work.doWork();

    }

}
