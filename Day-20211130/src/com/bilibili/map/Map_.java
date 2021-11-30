package com.bilibili.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Map_ {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("约翰拉贝", 1950);
        hm.put("白求恩", 1939);

//        System.out.println(hm.containsKey("约翰拉贝"));
//        System.out.println(hm.containsValue(1939));
//        System.out.println(hm.isEmpty());
//        System.out.println(hm);

        for (String s : hm.keySet()) {
            System.out.println(s+"-"+hm.get(s));
        }

        for (Map.Entry<String, Integer>entry : hm.entrySet()) {
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }

        hm.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        });
    }
}

