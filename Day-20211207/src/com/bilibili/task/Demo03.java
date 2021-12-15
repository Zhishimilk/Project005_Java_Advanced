package com.bilibili.task;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
//        定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。
        FutureTask<Integer> ift = new FutureTask<Integer>(new getSum());
        new Thread(ift).start();
        System.out.println(ift.get());
    }
}

class getSum implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}