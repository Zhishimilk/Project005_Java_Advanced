package com.bilibili.thread.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Customer extends Thread{
    private ArrayBlockingQueue<String> abq;

    public Customer(ArrayBlockingQueue<String> abq) {
        this.abq = abq;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("拿到"+abq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
