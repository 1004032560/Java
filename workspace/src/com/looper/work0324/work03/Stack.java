package com.looper.work0324.work03;

public class Stack {

    private int maxSize;  //栈的最大容量
    int [] stack;
    int top = -1;  //栈顶

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    //判断栈是否为满
    public boolean isFull(){
        return top == (maxSize-1);
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return top == -1;
    }

    //入栈
    public void push(int value){
        if (isFull()){
            System.out.println("栈已满");
        }else{
            top++;
            stack[top] = value;
        }
    }

    //出栈
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("栈为空");
        }else{
            int value = stack[top];
            top--;
            return value;
        }
    }

    //遍历
    public void list(){
        if (isEmpty()){
            System.out.println("栈为空");
        }else{
            for (int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }

}
