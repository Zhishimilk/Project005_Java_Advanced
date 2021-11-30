package com.biliibli.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
//        定义一个HashMap集合，它包含三个元素，每一个元素的键是String类型，值是ArrayList类型。
//        键：String			人物来自哪部电视剧
//        值：ArrayList		人物的名称
//
//        每一个ArrayList集合的数据是String类型的。
//        给出如下的字符串数据，请用代码实现需求。
//        第一个ArrayList集合的元素：(三国演义)
//                诸葛亮
//        赵云
//        第二个ArrayList集合的元素：(西游记)
//                唐僧
//        孙悟空
//        第三个ArrayList集合的元素：(水浒传)
//                武松
//        鲁智深
//        最后对以上Map集合进行遍历

        HashMap<String, ArrayList> hmp = new HashMap<>();
        ArrayList<String> the_Three_Kingdoms = new ArrayList<>();
        the_Three_Kingdoms.add("诸葛亮");
        the_Three_Kingdoms.add("赵云");
        ArrayList<String> journey_to_the_West = new ArrayList<>();
        journey_to_the_West.add("唐僧");
        journey_to_the_West.add("孙悟空");
        ArrayList<String> all_Men_Are_Brothers = new ArrayList<>();
        all_Men_Are_Brothers.add("武松");
        all_Men_Are_Brothers.add("鲁智深");
        
        hmp.put("the_Three_Kingdoms", the_Three_Kingdoms);
        hmp.put("journey_to_the_West", journey_to_the_West);
        hmp.put("all_Men_Are_Brothers", all_Men_Are_Brothers);

        Set<String> keys = hmp.keySet();
        for (String key : keys) {
            System.out.print(key);
            System.out.println(hmp.get(key));
        }
    }
}
