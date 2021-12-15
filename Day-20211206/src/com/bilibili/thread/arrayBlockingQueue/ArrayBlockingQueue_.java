package com.bilibili.thread.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue_ {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(1);

//        try {
//            abq.put("1");
//            abq.put("1");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Cooker cooker = new Cooker(abq);
        Customer customer = new Customer(abq);

        cooker.start();
        customer.start();
    }
}
