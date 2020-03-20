package com.looper.day1.test5;

/**
 * 方法内部类
 */

public class OuterClass {

    int num1;

    public void show(){

        int num2 = 0;

        //使用这个num2++;会使局部内部类中的num2报错；
        //num2++;

        class InnerClass{

            int num3;
            //内部存在num2时，则会直接用num2；调用不了外部num2
            //int num2;

            public void show(){

                System.out.println(num1);
                //在局部内部类的方法中，调用num2时，num2必须先赋值
                //默认final修饰的num2；内外都不能对其值进行修改
                System.out.println(num2);
                System.out.println(num3);

                //可以调用外部类的方法
                fly();
                //调用，与内部类方法名相同的方法时，需要用类名和this指明是哪个方法
                //直接是show()时，则表示调用的内部类的show()方法
                OuterClass.this.show();

                num1 = 10;
                //不能在局部内部类中，修改局部内部类所在方法中的变量
                //num2 = 20;
                num3 = 30;
            }

        }

    }

    public void fly(){
        System.out.println("飞翔");
    }

}
