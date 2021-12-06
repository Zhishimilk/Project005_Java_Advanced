package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
//        定义main()方法，按以下顺序编写程序：
//        定义集合List<String>，添加以下数据：
//	“王佳乐”
//			“张三丰”
//			“王思聪”
//			“张飞”
//			“刘晓敏”
//			“张靓颖”
//			“王敏”
//
//        使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
//        筛选后，获取前两个，并打印。
//        重新获取Stream流，用filter()方法筛选出所有的“王”姓学员；
//        筛选后，跳过前1个，打印剩余的人员。
        List<String> list = new ArrayList<>(List.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
        list.stream()
                .filter(s -> s.startsWith("张"))
                .limit(2)
                .forEach(System.out::println);
        list.stream()
                .filter(s -> s.startsWith("王"))
                .skip(1)
                .forEach(System.out::println);
    }
}
