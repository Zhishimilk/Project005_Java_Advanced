package com.bilibili.srotDemo;

import java.util.Scanner;

public class Dichotomy {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 8, 9, 10, 11};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int index = dichotomySearch(arr, num);
        System.out.println(index);
    }

    private static int dichotomySearch(int[] arr, int num) {
        int min = 0, max = arr.length-1, mid;

        while(min <= max){
            mid = (min + max) >>1;
            if(arr[mid] > num){
                max = mid - 1;
            }else if(arr[mid] < num){
                min = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

}
