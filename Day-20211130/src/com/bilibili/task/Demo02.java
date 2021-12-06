package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo02 {
    public static void main(String[] args) {
//        定义main()方法，按以下顺序编写程序：
//        定义集合List<String>，添加以下数据：
//			“张三丰”
//			“王思聪”
//			“张飞”
//			“刘晓敏”
//			“张靓颖”
//        使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
//        筛选后，使用count()方法获取筛选的数量。

        List<String> list = new ArrayList<>(List.of("张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖"));
        list.stream()
                .filter((s) -> s.startsWith("张"))
                .forEach(System.out::println);
        long count = list.stream()
                .filter(s -> s.startsWith("张"))
                .count();
        System.out.println(count);
    }
}
