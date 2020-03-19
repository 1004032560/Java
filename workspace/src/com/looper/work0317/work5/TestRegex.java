package com.looper.work0317.work5;

public class TestRegex {

    public static void main(String[] args) {
        VerifyUtilImpl verifyUtil = new VerifyUtilImpl();
        System.out.println(verifyUtil.verifyEmail("1004032560@qq.com"));
        System.out.println(verifyUtil.verifyPhone("17320038067"));
    }

}
