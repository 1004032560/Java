package com.looper.day5.test1;

public class TicketTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ticket(),"窗口1");
        Thread thread2 = new Thread(new Ticket(),"窗口2");

        thread1.start();
        thread2.start();
    }

}
