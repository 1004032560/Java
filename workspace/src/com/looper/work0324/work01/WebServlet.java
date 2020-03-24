package com.looper.work0324.work01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface WebServlet {

    String name();
    String displayName();
    int loadOnStartup();
    boolean asyncSupported();
    String[] urlPatterns();
    WebInitParam [] initParams();

}
