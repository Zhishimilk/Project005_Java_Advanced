package com.bilibili.anonymous.demo;
//	在下面的代码中，请分别使用Lambda的标准格式及省略格式调用 invokeCalc 方法，完成130和120的相减计算：
public class Test05 {
    public static void main(String[] args) {
        // TODO 请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130-120的结果?
       invokeCalc(10, 20, (a, b) -> a - b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}

//    给定一个计算器 Calculator 接口，内含抽象方法 calc (减法)，其功能是可以将两个数字进行相减，并返回差值。使用Lambda表达式在Test中完成调用。
@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}



