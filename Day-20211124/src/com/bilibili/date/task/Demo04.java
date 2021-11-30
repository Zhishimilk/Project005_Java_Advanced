package com.bilibili.date.task;

import java.util.Calendar;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) {
        //    使用Calendar类获取当前系统时间的日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台
        Calendar cld = Calendar.getInstance();
        cld.setTime(new Date());
        int year = cld.get(Calendar.YEAR);
        int month = cld.get(Calendar.MONTH) + 1;
        int day = cld.get(Calendar.DATE);
        int hour = cld.get(Calendar.HOUR);
        int minute = cld.get(Calendar.MINUTE);
        int second = cld.get(Calendar.SECOND);
        System.out.println(year+"年、"+month+"月、"+day+"日、"+hour+"小时、"+minute+"分、"+second+"秒");
    }
}
