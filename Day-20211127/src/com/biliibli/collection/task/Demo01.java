package com.biliibli.collection.task;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        String[] arr = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.addFirst(arr[i]);
        }

        System.out.println(list);
        list = delRepeat(list);
        System.out.println(list);
    }

    private static LinkedList<String> delRepeat(LinkedList<String> list) {

        for (int i = 0; i < list.size(); ) {
            for (int j = list.size() - 1; j >= 0; j--) {
                if(i == j){
                    i++;
                    break;
                }else if(list.get(i).equals(list.get(j))){
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }
}
