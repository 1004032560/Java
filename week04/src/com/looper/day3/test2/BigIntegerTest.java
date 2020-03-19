package com.looper.day3.test2;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {

        BigInteger bigInteger1 = new BigInteger("23256546546466485");
        BigInteger bigInteger2 = new BigInteger("23256546546465464");

        //bigInteger1 = 222222222222222222222222222;
        //bigInteger2 = 333333333333333333333333333;

        BigInteger sum = bigInteger1.add(bigInteger2);
        System.out.println(sum);
    }

}
