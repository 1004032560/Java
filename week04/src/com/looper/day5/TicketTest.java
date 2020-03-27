package com.looper.day5;

public class TicketTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");

        thread1.start();
        thread2.start();
    }

}
