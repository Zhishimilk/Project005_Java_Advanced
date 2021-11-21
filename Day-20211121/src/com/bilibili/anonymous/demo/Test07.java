package com.bilibili.anonymous.demo;

public class Test07 {
    public static void main(String[] args) {
        showLongTime(() -> System.out.println(System.currentTimeMillis()));
    }

    public static void showLongTime(CurrentTimePrinter timePrinter){
        timePrinter.printCurrentTime();
    }
}

@FunctionalInterface
interface CurrentTimePrinter{
    void printCurrentTime();
}