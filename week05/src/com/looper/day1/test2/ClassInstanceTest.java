package com.looper.day1.test2;

import java.lang.reflect.Method;

public class ClassInstanceTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class class1 = Student.class;
        System.out.println(class1);

        //使用反射动态创建对象
        //向下造型
        Student student = (Student) class1.newInstance();
        System.out.println("通过反射创建出的对象："+student);

        Method [] methods = class1.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

    }

}
