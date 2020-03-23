package com.looper.day1.test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassMethodTest1 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class class1 = Student.class;

        Object object = class1.newInstance();

        System.out.println(object);

        Method method = class1.getMethod("toString");
        System.out.println(method.invoke(object));

        //给id赋值
        Method method1 = class1.getMethod("setId", int.class);
        method1.invoke("object",123);
        //System.out.println(object);

        //给name赋值
        Method method2 = class1.getMethod("setName", String.class);
        method2.invoke("object","whj");
        //System.out.println(object);

        //System.out.println(method.invoke("object"));

    }

}
