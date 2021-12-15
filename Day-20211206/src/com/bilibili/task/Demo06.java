package com.bilibili.task;

public class Demo06 {
    public static void main(String[] args) {
//    模拟多个人通过一个山洞：
//        1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
//        2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于
//           记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；

        Cave cave = new Cave();
        for (int i = 0; i < 10; i++) {
            new Person("张"+i).start();
//            new Thread(cave, "张"+i).start();
        }
    }
}
class Cave implements Runnable{

    private Integer count=0;

    @Override
    public void run() {

        through();
    }
    public synchronized void through() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"第"+count+"位通过山洞");
    }
}

class Person extends Thread{
    private String name;
    private static Integer count = 0;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (count) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(name+"第"+count+"位通过山洞");
        }
    }
}