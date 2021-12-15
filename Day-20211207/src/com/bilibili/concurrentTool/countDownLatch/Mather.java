package com.bilibili.concurrentTool.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Mather extends Thread{
    private CountDownLatch cdl;

    public Mather(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("收拾");
    }
}
