package com.looper.work0324.work03;

public class StackTest {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(15);
        stack.push(25);
        stack.push(40);

        stack.list();

        stack.pop();

        stack.list();



    }

}
