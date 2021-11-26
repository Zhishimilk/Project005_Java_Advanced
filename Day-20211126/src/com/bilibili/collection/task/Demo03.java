package com.bilibili.collection.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo03 {
    public static void main(String[] args) {
//        第3题：分析以下需求，并用代码实现
//        请定义一个Collection类型的集合，存储以下分数信息：
//        88.5,39.2,77.1,56.8,89.0,99.0,59.5
//
//        请编程实现以下功能：
//        使用增强for遍历所有元素，并打印
//        使用增强for遍历所有元素，打印不及格的分数；
//        使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
//        使用增强for遍历所有元素，求出最高分，并打印（记录最高分的变量初始值可以设为0）；
//        (注意：以上所有功能写在一个main()方法中，但请单独实现)
        Collection<Double> col = List.of(8.5, 39.2, 77.1, 56.8, 89.0, 99.0, 59.5);
        for (double d : col) {
//            if(d < 60)
            System.out.println(d);
        }
    }
}
