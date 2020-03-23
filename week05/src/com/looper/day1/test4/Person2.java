package com.looper.day1.test4;

/**
 * 泛型类
 */

public class Person2 {

    private int id;
    private String name;
    //还有一个属性，是车子或者房子不固定；解决方式：将属性写成一个参数
    private Object object;

    public Person2() {
    }

    public Person2(int id, String name, Object object) {
        this.id = id;
        this.name = name;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", object=" + object +
                '}';
    }
}
