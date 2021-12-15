package com.bilibili.task;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo07 {
    public static void main(String[] args) {
//                某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,利用多线程模拟年会入场过程,
//        并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
//        编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
//        编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
//        //.....
//        从后门入场的员工总共: 13 位员工
//        从前门入场的员工总共: 87 位员工

        new Thread(new Party(), "后门").start();
        new Thread(new Party(), "前门").start();
    }
}

class Party implements Runnable{
    private static  AtomicInteger num = new AtomicInteger(0);

    @Override
    public void run() {
        Random rd = new Random();
        int count = 0;
        while (true) {
                if (num.get() >= 100)
                    break;
                count++;

                StringBuilder sb = getLottery(rd);

                System.out.println("编号为: "+num.incrementAndGet()+" 的员工 从"+Thread.currentThread().getName()+"入场! 拿到的双色球彩票号码是: "+sb.toString());
        }
        System.out.println("从"+Thread.currentThread().getName()+"入场的员工总共: "+count+" 位员工");
    }

    private StringBuilder getLottery(Random rd) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < 6; i++) {
            sb.append(rd.nextInt(4));
            sb.append(rd.nextInt(3)+1);
            sb.append(", ");
        }
        sb.append(rd.nextInt(2));
        sb.append(rd.nextInt(6)+1);
        sb.append("]");
        return sb;
    }
}
