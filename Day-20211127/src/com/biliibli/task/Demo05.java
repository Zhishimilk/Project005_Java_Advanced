package com.biliibli.task;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo05 {
    public static void main(String[] args) {
//        1.	统计每个单词出现的次数
//        2.	有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
//                3.	打印格式：
//        to=3
//        think=1
//        you=2
        String[] arr = "If you want to change your fate I think you must come to the dark horse to learn java".split(" ");
        TreeMap<String, Integer> hm = new TreeMap<>(String::compareToIgnoreCase);
        for (String s : arr) {
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry);
        }

        hm.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.print(entry + " "));
    }
}
