package com.biliibli.task;

import java.util.HashMap;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
//        现在有一个map集合如下：
//        Map<Integer,String> map = new HashMap<Integer, String>();
//        map.put(1, "张三丰");
//        map.put(2, "周芷若");
//        map.put(3, "汪峰");
//        map.put(4, "灭绝师太");
//        要求：
//        1.遍历集合，并将序号与对应人名打印。
//        2.向该map集合中插入一个编码为5姓名为李晓红的信息
//        3.移除该map中的编号为1的信息
//        4.将map集合中编号为2的姓名信息修改为"周林"
        HashMap<Integer, String> hmp = new HashMap<>();
        hmp.put(1, "张三丰");
        hmp.put(2, "周芷若");
        hmp.put(3, "汪峰");
        hmp.put(4, "灭绝师太");
        hmp.put(5, "李晓红");
        hmp.remove(1);
        hmp.put(2, "周林");

        show(hmp);
    }

    public static void show(HashMap<Integer, String> hmp) {
        Set<Integer> keys = hmp.keySet();
        for (Integer key : keys) {
            System.out.println(hmp.get(key));
        }
    }
}
