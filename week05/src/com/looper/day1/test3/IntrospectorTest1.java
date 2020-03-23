package com.looper.day1.test3;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IntrospectorTest1 {


    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class class1 = Student.class;
        Object object = class1.newInstance();

        //1、获取BeanInfo实例
        //使用introspector类的get.BeanInfo()方法获取到BeanInfo对象
        BeanInfo beanInfo = Introspector.getBeanInfo(Student.class);

        //2、获取属性描述
        //使用PropertyDescriptor类
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        //3、通过迭代返回所有的属性的名字信息
        System.out.println("属性的信息如下：");
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            //获取name属性的set方法
            if ("name".equals(propertyDescriptor.getName())){//找到了属性
                System.out.println("==================");
                Method method = propertyDescriptor.getWriteMethod();
                //执行
                method.invoke(object,123);
                System.out.println(object);
            }

            //获取name属性的get方法
            if ("name".equals(propertyDescriptor.getName())){//找到了属性
                System.out.println("==================");
                Method method = propertyDescriptor.getReadMethod();
                //System.out.println(method);
                //执行
                Object name = method.invoke(object);
                System.out.println(name);

            }
        }

    }

}
