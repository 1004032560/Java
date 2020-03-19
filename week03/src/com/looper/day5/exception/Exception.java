package com.looper.day5.exception;

public class Exception {

    public static void main(String[] args) {

        try {
            int res = 10;
            System.out.println(res/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println("算数异常");
            return;
        }catch (RuntimeException e){
            System.out.println("运行期异常");
        }finally{
            System.out.println("????");
        }

        System.out.println("程序结束");


    }

}
