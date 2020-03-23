package com.looper.work0323.work03;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WorkerTest {

    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class classWorker = Class.forName("com.looper.work0323.work03.Worker");
        Worker worker = (Worker) classWorker.newInstance();

        //1、获取BeanInfo的实例
        BeanInfo beanInfo = Introspector.getBeanInfo(Class.forName("com.looper.work0323.work03.Worker"));

        //2、获取属性的描述
        PropertyDescriptor[] proDescriptor = beanInfo.getPropertyDescriptors();

        //3、获取所有属性的名字
        for (PropertyDescriptor descriptor : proDescriptor) {

            System.out.println(descriptor.getName());

            if ("id".equals(descriptor.getName())){
                //获取属性的set方法
                Method method = descriptor.getWriteMethod();
                System.out.println(worker.show());
                method.invoke(worker,1005);
                System.out.println(worker.show());
            }else if ("name".equals(descriptor.getName())){
                //获取属性的name方法
                Method method = descriptor.getWriteMethod();
                System.out.println(worker.show());
                method.invoke(worker,"looper");
                System.out.println(worker.show());
            }else if ("salary".equals(descriptor.getName())){
                //获取属性的set方法
                Method method = descriptor.getWriteMethod();
                System.out.println(worker.show());
                method.invoke(worker,10000.00);
                System.out.println(worker.show());
            }


        }


    }

}
