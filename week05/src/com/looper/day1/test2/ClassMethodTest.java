package com.looper.day1.test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassMethodTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class class1 = Student.class;

        //创建一个对象
        Student student = (Student) class1.newInstance();
        Object object = class1.newInstance();
        /*System.out.println(object);
        System.out.println(student);*/

        System.out.println("==========================================");
        //获取所有的方法对象
        Method[] methods = class1.getMethods();

        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }


        System.out.println("==========================================");
        //获取某个对象方法
        Method method = class1.getMethod("toString");
        System.out.println(method);


        System.out.println("==========================================");
        //执行方法
        System.out.println(method.invoke(object));


        System.out.println("==========================================");
        //设置属性方法
        Method method1 = class1.getMethod("show", String.class, int.class);
        //执行show方法
        System.out.println(method1.invoke(object,"whj",1001));

        Method method2 = class1.getMethod("setName",String.class);
        //执行show方法
        method2.invoke(object,"WWW");

        Method method3 = class1.getMethod("toString");
        //执行show方法
        System.out.println(method3.invoke(object));

    }

}
