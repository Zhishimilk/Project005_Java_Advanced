package com.bilibili.thread.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    private ArrayBlockingQueue<String> abq;

    public Cooker(ArrayBlockingQueue<String> abq) {
        this.abq = abq;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("汉堡来啰~");
            try {
                abq.put("汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
