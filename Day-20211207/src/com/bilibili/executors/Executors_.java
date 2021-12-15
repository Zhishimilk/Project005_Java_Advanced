package com.bilibili.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors_ {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
//        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(()-> System.out.println(Thread.currentThread().getName()+"-----hello"));
        es.submit(()-> System.out.println(Thread.currentThread().getName()+"-----world"));
        es.shutdown();
    }
}
