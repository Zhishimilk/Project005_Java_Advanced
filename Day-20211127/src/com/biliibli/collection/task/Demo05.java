package com.biliibli.collection.task;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo05 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        ts.add("hello");
        ts.add("world");
        ts.add("java");
        ts.add("php");

        Iterator<String> ite = ts.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
