package com.bilibili.concurrentTool.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Child3 extends Thread{
    private CountDownLatch cdl;

    public Child3(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 17; i++) {
            System.out.println("aa吃第"+i+"个饺子");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cdl.countDown();
    }
}
