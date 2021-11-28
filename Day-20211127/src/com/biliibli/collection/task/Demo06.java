package com.biliibli.collection.task;

import java.util.Arrays;

public class Demo06 {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 2, 3, 4, 5};
//        swap(arr, 0, arr.length-1);
        reverse(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
    public static <T> void swap(T[] t, int i1, int i2){
        T temp = t[i1];
        t[i1] = t[i2];
        t[i2] = temp;
    }

    public static <T> void reverse(T[] t){
        int start = 0, end = t.length-1;
        while(start < end){
            swap(t, start++, end--);
        }
    }
}
