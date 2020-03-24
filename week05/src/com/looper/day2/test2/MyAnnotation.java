package com.looper.day2.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */

//自定义的注解的修饰目标  是类、接口、枚举
@Target(value = ElementType.TYPE)
//自定义注解的生命周期
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    //注解属性看起来像个方法其实是属性 属性类包括所有的基本数据类型
    public String urlPattern() default "www.looper.com";
    //属性可以设置默认值
    public boolean onload() default false;

}
