package com.looper.day3;
public class Test2 {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1==str2);

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3==str4);

        //String类型比较内容
        //但是String的equals方法已经重写过了
        //可以进行比较，其他引用类型则不可以用equals方法比较
        Boolean flag = str1.equals(str2);
        System.out.println(flag);

    }

}
