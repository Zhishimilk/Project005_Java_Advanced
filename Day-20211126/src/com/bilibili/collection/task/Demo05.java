package com.bilibili.collection.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);
        MyArrays.reverse(list);
        MyArrays.replaceAll(list, 5, 6);
        System.out.println(list);
    }
}

class MyArrays{
//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：对list集合对象中的元素进行反转(第一个和最后一个交换，第二个和倒数第二个交换，第三个和倒数第三个交换...)
    public static void reverse(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            list.add(0, list.remove(i));
        }
    }

//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：求出list集合对象中的最大值并返回
    public static Integer max(ArrayList<Integer> list){
        Integer max = list.get(0);
        for (Integer integer : list) {
            if(integer > max){
                max = integer;
            }
        }
        return max;
    }

//        参数ArrayList<Integer> list:要进行操作的集合对象
//        要求：求出list集合对象中的最小值并返回
    public static Integer min(ArrayList<Integer> list){
        Integer min = list.get(0);
        for (Integer integer : list) {
            if(integer < min){
                min = integer;
            }
        }
        return min;
    }

//        参数ArrayList<Integer> list:要进行操作的集合对象
//        参数Integer i:需要在集合中查找的元素
//        要求：求出元素i在list集合中第一次出现的索引，如果没有返回-1
    public static int indexOf(ArrayList<Integer> list,Integer i){
        int index = -1;
        for (Integer integer : list) {
            index++;
            if(integer == i){
                return index;
            }
        }
        return -1;
    }

//        参数ArrayList<Integer> list:要进行操作的集合对象
//        参数Integer oldValue:需要被替换掉的原值
//        参数Integer newValue：替换后的新值
//        要求：将list集合中的所有值为oldValue的元素替换为newValue
    public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == oldValue){
                list.remove(i);
                list.add(i, newValue);
            }
        }
    }
}


