package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo06 {
    public static void main(String[] args) {
//        1.定义一个Person类，包含一个属性：姓名(String)
//        定义无参、全参构造方法
//        定义get/set方法
//        2.定义main()方法，按以下顺序编写程序：
//        定义集合List<String>，添加以下数据：
//		“王佳乐”
//		“张三丰”
//		“王思聪”
//		“张飞”
//        使用Stream流的map()方法，将每个元素封装为一个Person对象。
//        将新流中的元素提取为List集合。
//        遍历、打印集合中所有的Person对象信息。

        List<String> list = new ArrayList<>(List.of("王佳乐", "张三丰", "王思聪", "张飞"));
        ArrayList<Person> pakList = list.stream()
                .map(Person::new)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Person person : pakList) {
            System.out.println(person);
        }
    }
}

class Person{
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}