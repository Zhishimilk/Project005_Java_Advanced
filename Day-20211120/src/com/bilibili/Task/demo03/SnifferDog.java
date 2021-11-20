package com.bilibili.Task.demo03;

public class SnifferDog extends Animal implements AntiDrug{
    @Override
    public void bark() {
        System.out.println("汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void antiDrug() {
        System.out.println("用鼻子侦测毒品");
    }
}
