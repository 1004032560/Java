package com.looper.day1.test3;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectorTest {


    public static void main(String[] args) throws IntrospectionException {

        //1、获取BeanInfo实例
        //使用introspector类的get.BeanInfo()方法获取到BeanInfo对象
        BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);

        //2、获取属性描述
        //使用PropertyDescriptor类
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        //3、通过迭代返回所有的属性的名字信息
        System.out.println("属性的信息如下：");
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            System.out.println(propertyDescriptor.getName());
        }



    }

}
