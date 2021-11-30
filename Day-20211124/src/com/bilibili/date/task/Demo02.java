package com.bilibili.date.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) throws ParseException {
//    从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，
//    程序要能够计算并打印：第一个生日大于/小于第二个生日。
//    注意：要求验证生日日期必须早于当前日期
        Scanner sc = new Scanner(System.in);
        Date date1 = new SimpleDateFormat("yyyy年MM月dd日").parse(sc.next());
        Date date2 = new SimpleDateFormat("yyyy年MM月dd日").parse(sc.next());
        long result = date1.getTime() - date2.getTime();
        if(result == 0){
            System.out.println("第一个生日等于第二个生日");
        }else if(result > 0){
            System.out.println("第一个生日大与第二个生日");
        }else {
            System.out.println("第一个生日小与第二个生日");
        }
    }
}
