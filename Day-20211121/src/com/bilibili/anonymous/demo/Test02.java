package com.bilibili.anonymous.demo;

public class Test02 {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

@FunctionalInterface
interface Inter {
    void show();
}

class Outer {
    //补齐代码
    public static Inter method(){
        return () -> System.out.println("Hello World!");
    }
}