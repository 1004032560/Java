package com.looper.work0323.work02;

import java.lang.reflect.Method;

public class MethodTest {

    public static Object execute(String className, String methodName, Object[] objs) {
        Object object = null;
        Object obj = null;
        Method method = null;

        try {
            obj = Class.forName(className).newInstance();
            method = obj.getClass().getMethod(methodName);
            object = method.invoke(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return object;
    }

}