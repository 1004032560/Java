package com.looper.day1.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

    public static ExecutorService THREAD_POOL = Executors.newFixedThreadPool(10);
    static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            THREAD_POOL.submit(new Runnable() {
                @Override
                public void run() {
                    String date = new ThreadLocalTest().date(finalI);
                    System.out.println(date);
                }
            });
        }
        // 关闭线程池，此种关闭方式不再接受新的任务提交，等待现有队列中的任务全部执行完毕之后关闭
        THREAD_POOL.shutdown();
    }

    private String date(int seconds) {
        // 参数的单位是毫秒，从1970.1.1 00:00:00 GMT计时
        Date date = new Date(1000 * seconds);

        return DATE_FORMAT.format(date);
    }


}
