package com.bilibili.Task.demo01;

public class Test {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.eat();
        ((Cat)cat).catchMouse();
    }
}
