package com.looper.day5.test7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * execute()方法
 */

public class ExecutorExecuteTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MyRunnable runnable1 = new MyRunnable();
        executorService.execute(runnable1);

        MyRunnable runnable2 = new MyRunnable();
        executorService.execute(runnable2);

    }

}
