package com.bilibili.task.test04;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {

        int[] arr = {-6, 9, 11, 20, 25, 102};
        int index = binarySearch(arr, 9);
        System.out.println(index);
    }

    private static int binarySearch(int[] arr, int num) {
        int start = 0, end = arr.length - 1, mid;

        while(start <= end){
            mid = (start+end) >> 2;
            if(arr[mid] < num)
                start = mid + 1;
            else if(arr[mid] > num)
                end = mid - 1;
            else
                return mid;
        }

        return -1;
    }
}
