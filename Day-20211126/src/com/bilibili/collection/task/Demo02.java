package com.bilibili.collection.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
//        请定义一个Collection类型的集合，存储以下字符串：
//			“JavaEE企业级开发指南”，”Oracle高级编程”，
//			”MySQL从入门到精通”，”Java架构师之路”
//        请编程实现以下功能：
//        使用迭代器遍历所有元素，并打印
//        使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
//        使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
//        如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
//        (注意：以上功能写在一个main()方法中，但请单独实现)

        Collection<String> col = new ArrayList<>();
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");

        Iterator<String> itr = col.iterator();
        while(itr.hasNext()){
            String s = itr.next();

//            if(s.contains("Java"))
//                itr.remove();
//            if(s.indexOf("Java") != -1)
//            if(s.contains("Java"))
//                System.out.println(s);
//            if(s.length() < 10)
//                System.out.println(s);
//            System.out.println(itr.next());
        }
    }
}
