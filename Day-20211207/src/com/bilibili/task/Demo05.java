package com.bilibili.task;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Demo05 {
    public static void main(String[] args) {
//        请使用CountDownLatch编写一个程序，实现以下效果：
//        线程A打印：”开始计算”
//        线程B：计算1--100所有数的累加和，并打印结果。
//        线程A打印：”计算完毕”
        CountDownLatch cdl = new CountDownLatch(1);
        new B(cdl).start();
        new A(cdl).start();
    }
}

class A extends Thread{
    private CountDownLatch cdl;

    public A(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("开始计算");
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算完毕");
    }
}

class B extends Thread{
    private CountDownLatch cdl;
    public B(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        try {
            cdl.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
        cdl.countDown();
    }
}