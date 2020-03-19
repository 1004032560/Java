package com.looper.day3.test6;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    public static void main(String[] args) {
        ResourceBundle rb1 = ResourceBundle.getBundle("message");

        String value1 = rb1.getString("msg");

        System.out.println(value1);

        ResourceBundle rb2 = ResourceBundle.getBundle("message", Locale.US);

        String value2 = rb2.getString("msg");

        System.out.println(value2);

        ResourceBundle rb3 = ResourceBundle.getBundle("myMsg");

        String value3 = rb3.getString("msg");

        System.out.println(value3);

        ResourceBundle rb4 = ResourceBundle.getBundle("myMsg",Locale.US);

        String value4 = rb4.getString("msg");

        System.out.println(value4);
    }

}
