package com.bilibili.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_ {
    public static void main(String[] args) {

//        LocalDateTime date = LocalDateTime.parse("2017-12-03T10:15:30");

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        DayOfWeek dow = date.getDayOfWeek();
        System.out.println(dow.getValue());
    }
}
