package com.bilibili.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_ {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("wangwu");
        list.add("zhaoliu");
        list.add("tianqi");

        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("z"));
        Stream<String> stream2 = list.stream().filter(s -> s.length() > 5);
        Stream.concat(stream1, stream2).distinct().forEach(System.out::println);
        System.out.println("-----------------------");
        list.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("-----------------------");
        HashSet<String> hs = list.stream().filter(s -> s.length() == 5).collect(Collectors.toCollection(HashSet::new));
        String[] arrs = list.stream().toArray(String[]::new);
        for (String integer : arrs) {
            System.out.println(integer);
        }
    }
}
