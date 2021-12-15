package com.bilibili.concurrentTool.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Child1 extends Thread{
    private CountDownLatch cdl;

    public Child1(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("cc吃第"+i+"个饺子");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cdl.countDown();
    }
}
