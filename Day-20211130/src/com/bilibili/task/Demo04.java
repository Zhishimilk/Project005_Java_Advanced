package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
//        第4题：分析以下需求，并用代码实现
//        定义main()方法，按以下顺序编写程序：
//        定义集合List<String>，添加以下数据：
//	“王佳乐”
//			“张三丰”
//			“王思聪”
//			“张飞”
//			“刘晓敏”
//			“张靓颖”
//			“王敏”
//        先筛选出所有的“张”姓学员；
//        再筛选出所有的“王”姓学员；
//        将两个流合并为一个流
//        打印合并后的每个元素。
        List<String> list = new ArrayList<>(List.of("王佳乐", "张三丰", "王思聪", "张飞", "刘晓敏", "张靓颖", "王敏"));
        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream2 = list.stream().filter(s -> s.startsWith("王"));
        Stream<String> stream = Stream.concat(stream1, stream2);
        ArrayList<String> filterList = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(filterList);
    }
}
