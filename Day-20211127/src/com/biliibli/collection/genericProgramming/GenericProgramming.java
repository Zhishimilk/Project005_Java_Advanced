package com.biliibli.collection.genericProgramming;

import java.util.Comparator;
import java.util.TreeSet;

public class GenericProgramming {
    public static void main(String[] args) {
        Gp<String> stringGp = new Gp<>();
        stringGp.method(true);
        TreeSet<Integer> trs = new TreeSet<>((o1, o2) -> o2 - o1);
    }
}

class  Gp<T>{
    public <T> void method(T t){
        if(t instanceof String){
            System.out.println("String");
        }else if(t instanceof Integer){
            System.out.println("Integer");
        }else if(t instanceof Double){
            System.out.println("Double");
        }else {
            System.out.println("unknow");
        }
    }
}
