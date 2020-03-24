package com.looper.day2.test4;

public class Stack {

    private int maxSize;
    int [] stack;
    int top = -1;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    //判断栈为空
    public boolean isEmpty(){
        return top == -1;
    }

    //判断栈为满
    public boolean isFull(){
        return top == (maxSize-1);
    }

    //入栈
    public void push(int value){
        if (isFull()){
            System.out.println("栈已经满了");
        }else{
            top++;
            stack[top] = value;
        }
    }

    //出栈
    public int pop(){

        if (isEmpty()){
            //解决返回问题
            throw new RuntimeException("没有数据");
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
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

}
