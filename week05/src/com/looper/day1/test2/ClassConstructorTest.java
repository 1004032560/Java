package com.looper.day1.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassConstructorTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class class1 = Student.class;

        //使用反射动态创建对象
        //Constructor
        Constructor[] constructors = class1.getConstructors();

        //获取所有的构造方法
        /*for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }*/

        //获取某个的构造方法类的对象
        Constructor constructor = class1.getConstructor(String.class);
        //通过构造器创建对象
        Student object = (Student)constructor.newInstance(1001,"whj");
        System.out.println(object.toString());

    }

}
