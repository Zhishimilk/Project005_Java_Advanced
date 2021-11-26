package com.bilibili.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Date_ {
    public static void main(String[] args) /*throws ParseException*/ {

        Scanner sc = new Scanner(System.in);
        String birthday = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        long time1 = 0;
        try {
            time1 = sdf.parse(birthday).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time2 = new Date().getTime();
        System.out.println((time2 - time1) /1000/60/60/24);

        Calendar cld = Calendar.getInstance();

    }
}
