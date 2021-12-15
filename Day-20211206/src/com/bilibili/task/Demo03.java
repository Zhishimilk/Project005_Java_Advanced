package com.bilibili.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo03 {
    public static void main(String[] args) {
//        请使用继承Thread类的方式定义一个线程类，在run()方法中循环10次，每1秒循环1次，每次循环按“yyyy-MM-dd HH:mm:ss”的格式打印当前系统时间。
//        请定义测试类，并定义main()方法，启动此线程，观察控制台打印。
        new NewThead().start();
    }
}

class NewThead extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}