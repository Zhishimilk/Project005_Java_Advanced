package com.bilibili.concurrentTool.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch_ {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(3);

        new Mather(cdl).start();
        new Child1(cdl).start();
        new Child2(cdl).start();
        new Child3(cdl).start();

        cdl.await();
        Thread.sleep(1000);
    }
}
