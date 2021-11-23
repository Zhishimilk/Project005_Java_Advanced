package com.gitHub.AlgorithmPractice.part06;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        ListNode nextNode;
        nextNode = listNode;
        for (int i = 1; i < 10; i++) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }

        //顺序遍历链表
        nextNode = listNode;
        while(nextNode != null){
            System.out.print(nextNode.val + " ");
            nextNode = nextNode.next;
        }
        System.out.println();

        //递归倒叙遍历链表
        nextNode = listNode;
        ArrayList list = new ArrayList<>();
        System.out.println(printListNode(nextNode, list));

        //头插法
        nextNode = listNode;
        System.out.println(printListFromTailToHead(nextNode));
    }

    //递归倒叙遍历链表方法
    public static ArrayList printListNode(ListNode listNode, ArrayList list){

        if (listNode != null){
            printListNode(listNode.next, list);
            list.add(listNode.val);
        }
        return list;
    }
    //头插法
    public static void printListNode2(ListNode listNode){

        if(listNode == null){
            System.out.println("null");
            return;
        }

        ListNode head, last, next;
        head = listNode;
        last = head.next;

        while(last != null){
            next = last;
            last = next.next;

        }

//        next = head;
        while( head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
    //头插法标准答案
    public static ArrayList printListFromTailToHead(ListNode listNode) {
        // 头插法构建逆序链表
        ListNode head = new ListNode<>(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        // 构建 ArrayList
        ArrayList ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }

        return ret;
    }
}
