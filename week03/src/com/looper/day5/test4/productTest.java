package com.looper.day5.test4;

public class productTest {

    public static void main(String[] args) {

        Product product1 =new Product(1001,"杯子",23.00,100);

        Product product2 =new Product(1001,"杯子",23.00,100);


        System.out.println(product1.toString());
        System.out.println(product2.toString());

        System.out.println("=======================================");

        if (product1.equals(product2)){
            System.out.println("product1和product2相同");
        }else{
            System.out.println("product1和product2不同");
        }



    }

}
