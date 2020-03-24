package com.looper.day2.test4;

public class StackTest {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.list();

        System.out.println("================");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.list();

        stack.pop();

        stack.list();

    }

}
