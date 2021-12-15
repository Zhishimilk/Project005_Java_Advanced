package com.bilibili.thread.waitAndNotify;

public class Customer extends Thread{
    @Override
    public void run() {
        synchronized(Desk.o) {
            while (true) {
                if (Desk.count == 0)
                    break;

                if (!Desk.flag) {
                    try {
                        Desk.o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("吃馒头");
                    try {
                        Thread.sleep(1000L);
                        Desk.flag = false;
                        Desk.count--;
                        Desk.o.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
