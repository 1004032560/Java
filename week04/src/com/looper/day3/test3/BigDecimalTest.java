package com.looper.day3.test3;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {

        double d1 = 4.3;
        double d2 = 5.8;
        double sum = d1 + d2;
        System.out.println(sum);

        BigDecimal bigDecimal1 = new BigDecimal(4.3);
        BigDecimal bigDecimal2 = new BigDecimal(5.8);
        BigDecimal res = bigDecimal1.add(bigDecimal2);

        System.out.println(res);

    }

}
