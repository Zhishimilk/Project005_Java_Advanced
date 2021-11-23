package com.bilibili.task.test06;

public class Demo06 {
    public static void main(String[] args) {

        int num = calculation(10);
        System.out.println(num);
    }

    private static int calculation(int day) {
        if(day == 0)
            return 1;
        else
            return 2*(calculation(--day)+1);
    }
}
