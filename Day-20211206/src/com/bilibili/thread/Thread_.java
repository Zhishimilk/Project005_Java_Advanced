package com.bilibili.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread_ {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //part01
        new myThread().start();

        //part02
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("hello"+i);
            }
        }).start();

        //part03
        FutureTask<String> ft = new FutureTask<>(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("java"+i);
            }
            return "hello, world!";
        });
        new Thread(ft).start();
        System.out.println(ft.get());


    }
}
class myThread extends Thread{
    private static int ticket = 100;
    private static Object o = new Object();

    @Override
    public void run() {
        synchronized (o) {
            while(true){
                if(ticket <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"-----"+ticket);
                ticket--;
            }
        }
    }
}