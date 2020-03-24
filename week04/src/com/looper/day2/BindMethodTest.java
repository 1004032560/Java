package com.looper.day2;

/**
 * 绑定成员态方法
 */

public class BindMethodTest {

    public static void main(String[] args) {

        C c = new C();
        ID id = c::show;
        id.print();

    }

}

class C{
    public void show(){
        System.out.println("来自C类的方法");
    }
}

interface ID{
    void print();
}