package com.biliibli.collection.task;

import java.util.Random;
import java.util.TreeSet;

public class Demo02 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random rd = new Random();
        while(set.size() < 10){
            set.add(rd.nextInt(20)+1);
        }
        System.out.println(set);
    }
}
