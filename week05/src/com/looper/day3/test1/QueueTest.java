package com.looper.day3.test1;

public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new Queue(4);

        queue.list();

        queue.add(51);
        queue.add(23);
        queue.add(98);
        queue.add(57);

        queue.list();

    }

}
