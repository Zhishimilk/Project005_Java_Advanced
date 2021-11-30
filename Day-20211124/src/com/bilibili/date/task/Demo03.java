package com.bilibili.date.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) throws ParseException {
        //    使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2018-03-04");
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(date));
    }
}
