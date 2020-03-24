package com.looper.day2.test2;

public class MyAnnotationTest {

    public static void main(String[] args) {

        //获取class的实例
        Class class1 = LoginWebComponent.class;

        //获取注解信息
        MyAnnotation myAnnotation = (MyAnnotation) class1.getAnnotation(MyAnnotation.class);

        //获取注解中的属性信息
        System.out.println(myAnnotation.urlPattern());
        System.out.println(myAnnotation.onload());
    }

}
