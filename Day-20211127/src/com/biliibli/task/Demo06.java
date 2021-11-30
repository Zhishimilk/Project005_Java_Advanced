package com.biliibli.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Demo06 {
    public static void main(String[] args) {
//        1.站编号和站名对应关系如下：
//        1=朱辛庄
//        2=育知路
//        3=平西府
//        4=回龙观东大街
//        5=霍营
//        //....
//        将以上对应关系的数据存储到map集合中，key：表示站编号，value：表示站名，并遍历打印(可以不按顺序打印)：
//        第10站: 森林公园南门
//        第6站: 育新
//        第12站: 奥体中心
//        第13站: 北土城
//        //...
        HashMap<Integer, String> hm = new HashMap<>(Map.ofEntries(
                Map.entry(1, "朱辛庄"),
                Map.entry(2, "育知路"),
                Map.entry(3, "平西府"),
                Map.entry(4, "回龙观东大街"),
                Map.entry(5, "霍营")));
        hm.put(6, "朝阳路");
        hm.put(7, "天安门");
        hm.put(8, "长城");
        hm.put(9, "颐和园");
        hm.put(10, "国家大剧院");
        hm.put(11, "森林公园南门");
        hm.put(12, "奥体中心");
        hm.put(13, "北土城");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("第"+entry.getKey()+"站: "+entry.getValue());
        }

//        2.计算地铁票价规则：
//        总行程 3站内（包含3站）收费3元，
//        3站以上但不超过5站（包含5站）的收费4元，
//        5站以上的，在4元的基础上，每多1站增加2元，
//        10元封顶；
//        3.打印格式（需要对键盘录入的上车站和到达站进行判断，如果没有该站，提示重新输入，直到站名存在为止）：
//        注意：每站需要2分钟
//        请输入上车站：
//        沙河
//        您输入的上车站：
//        上地
//        您输入的上车站：上地 不存在，请重新输入上车站：
//        朱辛庄
//        请输入到达站：
//        沙河
//        您输入的到达站： 沙河 不存在，请重新输入到达站：
//        西二旗
//        您输入的到达站： 西二旗 不存在，请重新输入到达站：
//        西小口
//        从朱辛庄到西小口共经过6站收费6元，大约需要 12分钟
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入上车站：");
        String up = sc.next();
        while(true){
            if(hm.containsValue(up)){
                break;
            }
            System.out.println(up+"不存在，请重新输入上车站：");
            up = sc.next();
        }

        System.out.println("请输入下车站：");
        String down = sc.next();
        while(true){
            if(hm.containsValue(down)){
                break;
            }
            System.out.println(down+"不存在，请重新输入下车站：");
            down = sc.next();
        }

        int upKey = getKey(hm, up);
        int downKey = getKey(hm, down);
        int throughPoint = downKey - upKey;
        int price = sumPrice(throughPoint, point -> {
            if(point > 7)
                return 10;
            else if(point <= 3)
                return 3;
            else if(point <=5)
                return 4;
            else
                return 4+(point  - 5)*2;
        });
        System.out.println("从"+up+"到"+down+"共经过"+throughPoint+"站收费"+price+"元，大约需要 "+throughPoint*2+" 分钟");
    }

    private static int getKey(HashMap<Integer, String> hm, String value) {
        for (Integer key : hm.keySet()) {
            if(hm.get(key).equals(value)){
                return key;
            }
        }
        return -1;
    }

    public static int sumPrice(int point, Function<Integer, Integer> f){
        return f.apply(point);
    }
}
