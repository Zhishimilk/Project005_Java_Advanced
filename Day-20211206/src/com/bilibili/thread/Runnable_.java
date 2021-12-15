package com.bilibili.thread;

public class Runnable_ {
    public static void main(String[] args) {
        Ticket tickets = new Ticket();
        Thread thread1 = new Thread(tickets);
        Thread thread2 = new Thread(tickets);
        Thread thread3 = new Thread(tickets);

        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class Ticket implements Runnable{
    private volatile int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket <= 0) {
                    break;
                }else {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-----"+ticket);
                    ticket--;
                }
            }
        }
    }
}