package com.bilibili.task;

public class Demo04 {

    static Integer a = null;
    static String b = null;
    static String c = null;

    public static void main(String[] args) {
//        创建三个子线程，在每个线程中开启10万次的循环，
//        线程1循环中将循环自增变量i赋值给Integer类型变量 a，
//        线程2循环中将字符串"黑马程序员"赋值给String类型变量b,
//                线程3循环中将字符串"黑马程序员"和循环自增变量i拼接后赋值给String类型变量c
//                分别计算三个线程完成任务所用的毫秒值

        //线程1
        new Thread(() -> {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 100; i++) {
                a = i;
                System.out.println(Thread.currentThread().getName()+"-----"+a);
            }

            long end = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+"共花费: "+(end - start)+"mms");
        }).start();

        //线程2
        new Thread(() -> {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 100; i++) {
                b = "黑马程序员";
                System.out.println(Thread.currentThread().getName()+"-----"+b);
            }

            long end = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+"共花费: "+(end - start)+"mms");
        }).start();

        //线程3
        new Thread(() -> {
            long start = System.currentTimeMillis();

            for (int i = 0; i < 100; i++) {
                c = b + a;
                System.out.println(Thread.currentThread().getName()+"-----"+c);
            }

            long end = System.currentTimeMillis();
            System.out.println(Thread.currentThread().getName()+"共花费: "+(end - start)+"mms");
        }).start();
    }
}
