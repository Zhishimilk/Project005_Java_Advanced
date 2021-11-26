package com.bilibili.task.test06;

public class Demo06 {
    public static void main(String[] args) {

        int num = calculation(3);
        System.out.println(num);
    }

    private static int calculation(int day) {
        if(day == 1)
            return 1;
        else
            return (calculation(day-1)+1) * 2;
    }
}
