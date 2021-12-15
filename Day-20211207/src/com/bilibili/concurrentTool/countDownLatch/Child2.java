package com.bilibili.concurrentTool.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Child2 extends Thread{
    private CountDownLatch cdl;

    public Child2(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("bb吃第"+i+"个饺子");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cdl.countDown();
    }
}
