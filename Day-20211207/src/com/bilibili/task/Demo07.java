package com.bilibili.task;

import java.util.concurrent.Semaphore;

public class Demo07 {
    public static void main(String[] args) {
//        请使用Semaphore编写一个程序，实现以下效果：有10名游客要参观展览室，
//        而“展览室”同时只允许最多“三个游客”参观，每个游客参观时间2秒。
        Semaphore sp = new Semaphore(3);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    sp.acquire();
                    System.out.println("游客"+ finalI +"正在参观");
                    Thread.sleep(2000L);
                    System.out.println("游客"+ finalI +"参观结束");
                    sp.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
