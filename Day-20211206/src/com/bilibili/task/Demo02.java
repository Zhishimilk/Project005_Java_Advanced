package com.bilibili.task;

public class Demo02 {
    public static void main(String[] args) {
//        创建多线程对象，开启多线程。在新线程中输出1-100之间的偶数，主线程输出1-100之间的奇数
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                if(i%2 == 0){
                    System.out.println(Thread.currentThread().getName()+"-----"+i);
                }
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            if(i%2 != 0){
                System.out.println(Thread.currentThread().getName()+"-----"+i);
            }
        }
    }
}
