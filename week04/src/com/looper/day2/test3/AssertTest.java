package com.looper.day2.test3;

public class AssertTest {

    public void test(int i){
        assert (i!=1):"输入值不能是1";
        System.out.println("参数是合法的"+i);
    }

    public static void main(String[] args) {
        AssertTest assertTest = new AssertTest();
        assertTest.test(3);
        assertTest.test(1);
    }

}
