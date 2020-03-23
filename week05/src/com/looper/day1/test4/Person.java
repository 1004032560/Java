package com.looper.day1.test4;

/**
 * 泛型类
 * @param <E>
 */

public class Person<E> {

    static int count = 1;
    private int id;
    private String name;
    //还有一个属性，是车子或者房子不固定；解决方式：将属性写成一个参数
    private E e;

    public Person(int id, String name, E e) {
        this.id = id;
        this.name = name;
        this.e = e;
    }

    public Person() {
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", e=" + e +
                '}';
    }
}
