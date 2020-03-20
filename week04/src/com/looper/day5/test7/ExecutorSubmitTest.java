package com.looper.day5.test7;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * submit()方法
 */

public class ExecutorSubmitTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        MyRunnable runnable1 = new MyRunnable();
        Future future1 = executorService.submit(runnable1);

        //java.util.concurrent.FutureTask@677327b6
        System.out.println(future1);

        try {
            //null;用于判断Runnable任务是否结束
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        /*MyRunnable runnable2 = new MyRunnable();
        Future future2 = executorService.submit(runnable2);

        //java.util.concurrent.FutureTask@7f31245a
        System.out.println(future2);

        try {
            //null
            System.out.println(future2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/

    }

}
