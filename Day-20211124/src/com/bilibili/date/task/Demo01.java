package com.bilibili.date.task;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
//        请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
        //part01
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        String s = sdf.format(new Date());
        System.out.println(s);

        //part02
//        DateFormatter dateFormatter = new DateFormatter();
//        dateFormatter.setFormat(sdf);
        String s1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy年MM月dd日  HH时mm分ss秒"));
        System.out.println(s1);
    }
}
