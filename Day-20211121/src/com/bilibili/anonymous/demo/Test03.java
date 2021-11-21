package com.bilibili.anonymous.demo;

public class Test03 {
    public static void main(String[] args) {

        new A().methodA(() -> System.out.println("InterA......showA()"));
    }
}
//定义接口
@FunctionalInterface
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}
