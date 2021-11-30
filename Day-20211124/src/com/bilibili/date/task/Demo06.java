package com.bilibili.date.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) throws ParseException {
//        1)	已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
//        2)	将(1)中的日期对象转换为日历类的对象
//        3)	根据日历对象获取该日期是星期几,以及这一年的第几天
//        4)	通过键盘录入日期字符串，格式(2015-10-20) ,如输入：2015-10-20，输出" "2015年-10月-20日 是 星期二，是2015年的293天""。
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);

        LocalDate ldt = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int week = ldt.getDayOfWeek().getValue();
        int day_of_year = cld.get(Calendar.DAY_OF_YEAR);
        System.out.println(sdf.format(date)+" 是 星期"+week+"，是"+cld.get(Calendar.YEAR)+"年的"+day_of_year+"天");
    }
}
