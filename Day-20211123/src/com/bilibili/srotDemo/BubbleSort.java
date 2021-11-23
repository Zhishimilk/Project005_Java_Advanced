package com.bilibili.srotDemo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 2, 9, 5, 6, 8};
        _sort(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(add(100));
    }

    public static void _sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }

    //递归
    public static int add(int num){
        if(num == 1){
            return 1;
        }
        return num + add(num - 1);
    }
}
