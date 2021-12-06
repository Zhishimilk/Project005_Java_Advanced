package com.bilibili.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
//        编写main()方法，在main()中按以下步骤编写代码：
//        1. 定义一个List<String>集合，并存储以下数据：
//				“cab”
//				“bac”
//				“acb”
//				“cba”
//				“bca”
//				“abc”
//        2. 使用Lambda表达式调用Collections的sort()方法对集合进行降序排序。
//        3. 排序后向控制台打印集合的所有元素。

        List<String> list = new ArrayList<>(List.of("cab", "bac", "acb", "cba", "bca", "abc"));
        Collections.sort(list, String::compareTo);
        System.out.println(list);
    }
}
