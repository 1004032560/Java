package com.looper.work0324.work01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
//自定义的注解的修饰目标   是类、接口、枚举
@Target(value = ElementType.TYPE)
//自定义的注解的生命周期   是运行时
@Retention(value = RetentionPolicy.RUNTIME)
public @interface WebInitParam {

    String name() default "法外狂徒-张三";
    String value() default "123";

}
