package com.bilibili.anonymous.demo;

public class Test06 {
    public static void main(String[] args) {

        getProduct(5, 7, (a, b) -> a*b);
    }

    public static void getProduct(int a, int b, IntCalc calc){
        System.out.println(calc.calc(a, b));
    }
}

@FunctionalInterface
interface IntCalc{
    int calc(int a, int b);
}