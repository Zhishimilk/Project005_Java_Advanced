package com.bilibili.task;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo06 {
    public static void main(String[] args) throws InterruptedException {
//        请使用ConcurrentHashMap定义一个线程安全的Map，使用两个线程访问它：
//        第一个线程：向集合中添加键、值都是：1--10000的数字；
//        第二个线程：向集合中添加键、值都是：10001--20000的数字；
//        确保两个线程全部操作集合完毕，然后打印集合的每个元素，测试期准确性。
        ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                chm.put(i, i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 101; i <= 200; i++) {
                chm.put(i, i);
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(1000L);

        for (Map.Entry<Integer, Integer> entry : chm.entrySet()) {
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }
}
