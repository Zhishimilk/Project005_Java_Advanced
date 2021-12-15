package com.bilibili.thread.waitAndNotify;

public class WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {

        new Cooker().start();
        new Customer().start();
    }
}

