package com.looper.work0324.work01;


/**
 * 测试
 */

public class LoginServletTest {

    public static void main(String[] args) {

        Class class1 = LoginServlet.class;

        WebServlet webServlet = (WebServlet) class1.getAnnotation(WebServlet.class);

        System.out.println(webServlet.asyncSupported());
        System.out.println(webServlet.displayName());
        System.out.println(webServlet.initParams());
        System.out.println(webServlet.loadOnStartup());

    }

}
