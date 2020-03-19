package com.looper.work0313.work1;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println("结果是："+str.length());
        }catch (NullPointerException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("空指针异常");
        }

        System.out.println("========================");

        try {
            System.out.println("结果是："+Integer.parseInt("abc"));
        }catch (NumberFormatException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("数字格式异常");
        }

        System.out.println("========================");

        try {
            Object obj = new Object();
            ExceptionTest e = (ExceptionTest)obj;
        }catch (ClassCastException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("类转换异常");
        }

        System.out.println("========================");

        try {
            int[] nums = new int[4];
            System.out.println("结果是："+nums[10]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("下标越界异常");
        }

        System.out.println("========================");

        try {
            int res = 10/0;
            System.out.println("结果："+res);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }finally {
            System.out.println("算数异常");
        }

    }

}
