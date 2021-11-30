package com.bilibili.date.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) throws ParseException {
//        计算并打印“1949年10月1日”那天是星期几？
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("1949年10月01日");
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        int week = cld.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        LocalDate ld = LocalDate.parse("1949年10月01日",DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        int dayOfWeek = ld.getDayOfWeek().getValue();
        int i = ld.get(ChronoField.DAY_OF_WEEK);
        System.out.println(dayOfWeek+","+i);

    }
}
