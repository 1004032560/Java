package com.looper.day5.test5;

public class Sheep implements Cloneable {

    private int id;
    private String name;

    public Sheep(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep(1001,"多莉");
        System.out.println(sheep);
        sheep.toString();

        //向下造型，clone()方法的父类是Object
        Sheep sheep1 = (Sheep)sheep.clone();
        System.out.println(sheep1);
    }
}
