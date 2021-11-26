package com.bilibili.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_ {
    public static void main(String[] args) {
        Collection<Object> col = new ArrayList<>();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(14);

        Iterator<Object> itr = col.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
