package com.bilibili.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10");
        BigDecimal bd2 = new BigDecimal("3");
        System.out.println(bd1.divide(bd2, 7, RoundingMode.UP));

        String[] arr1 = "23, 43, 12, 44, 33, 22".split(", ");
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
