package com.bilibili.Task.demo03;

public class Test {
    public static void main(String[] args) {
        Animal snifferDog = new SnifferDog();
        snifferDog.bark();
        snifferDog.eat();
        SnifferDog snifferDog1 = (SnifferDog) snifferDog;
        snifferDog1.antiDrug();
    }
}
