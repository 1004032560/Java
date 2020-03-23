package com.looper.work0323.work01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTeacherTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        //方式一：
        Class classTeacher1 = Teacher.class;

        //方式二：
        Teacher teacher = new Teacher();
        Class classTeacher2 = teacher.getClass();

        //方式二：
        Class classTeacher3 = Class.forName("com.looper.work0323.work01.Teacher");

        //使用newInstance的无参方式创建对象
        Teacher teacher1 =(Teacher)classTeacher3.newInstance();
        System.out.println(teacher1);

        //使用constructor的有参方式创建对象
        Constructor constructor = classTeacher3.getConstructor(int.class,String.class,double.class);
        Teacher teacher2 = (Teacher)constructor.newInstance(1001,"looper",10000.00);
        System.out.println(teacher2.show());

        //初始化所有属性
        Method method = classTeacher3.getMethod("setId", int.class);
        method.invoke(teacher2,1002);
        System.out.println(teacher2.show());

        //setName,设置name
        method = classTeacher3.getMethod("setName", String.class);
        method.invoke(teacher2,"SuperLooper");
        System.out.println(teacher2.show());

        //getName,获取name
        method = classTeacher3.getMethod("getName");
        System.out.println(method.invoke(teacher2));

        //执行show方法
        method = classTeacher3.getMethod("show");
        System.out.println(method.invoke(teacher2));

        //执行study方法
        method = classTeacher3.getMethod("study");

        //自学
        //null
        //study方法输出的是自学，返回值类型为void，所以main thread输出的是null
        System.out.println(method.invoke(teacher2));

        //直接输出自学
        method.invoke(teacher2);

    }

}
