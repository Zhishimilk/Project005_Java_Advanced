package com.bilibili.task.test02;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {55, 77, 0, 88, 22, 44, 33, 99};
        move(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void move(int[] arr, int i) {
        if (i == arr.length - 1) {
            arr[i] = 0;
        } else {
            arr[i] = arr[i++ + 1];
            move(arr, i);
        }
    }
}
