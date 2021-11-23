package com.bilibili.task.test05;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        String[] arr1 = "25 11 -6 20 102 9".split(" ");
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }

        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private static void bubbleSort(int[] arr) {
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
}
