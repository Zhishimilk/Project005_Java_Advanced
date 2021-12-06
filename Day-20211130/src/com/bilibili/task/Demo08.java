package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo08 {
    public static void main(String[] args) {
//        以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
//        全球
//	　　1、 《教父》
//	　　2、 《肖申克的救赎》
//	　　3、 《辛德勒的名单》
//	　　4、 《公民凯恩》
//	　　5、 《卡萨布兰卡》
//	　　6、 《教父续集》
//	　　7、 《七武士》
//	　　8、 《星球大战》
//	　　9、 《美国美人》
//	　　10、 《飞跃疯人院》
        ArrayList<String> total = new ArrayList<>(List.of("《教父》", "《肖申克的救赎》", "《辛德勒的名单》", "《公民凯恩》", "《卡萨布兰卡》", "《教父续集》", "《七武士》", "《星球大战》", "《美国美人》", "《飞跃疯人院》"));

//        华人
//	　  1、 《霸王别姬》
//	　　2、 《大闹天宫》
//	　　3、 《鬼子来了》
//	　　4、 《大话西游》
//	　　5、 《活着》
//	　　6、 《饮食男女》
//	　　7、 《无间道》
//	　　8、 《天书奇谭》
//	　　9、 《哪吒脑海》
//	　　10、 《春光乍泄》
        ArrayList<String> chinese = new ArrayList<>(List.of("《霸王别姬》", "《大闹天宫》", "《鬼子来了》", "《大话西游》", "《活着》", "《饮食男女》", "《无间道》", "《天书奇谭》", "《哪吒脑海》", "《春光乍泄》"));

//        1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
//        2、通过流的方式
//        1）打印全球影片排行榜中的前三甲影片名
//        2）打印华人影片排行榜中倒数5名的影片名
//        3）将两个排行榜中的前5名挑出来共同存入新的集合
//        4）定义电影Film类，以影片名为name创建Film对象并保存至集合

        total.stream().limit(3).forEach(System.out::println);
        System.out.println("------------------------");
        chinese.stream().skip(5).forEach(System.out::println);
        System.out.println("------------------------");

        Stream<String> stream1 = total.stream().filter(s -> total.indexOf(s) <= 5);
        Stream<String> stream2 = chinese.stream().filter(s -> chinese.indexOf(s) <= 5);
        ArrayList<Film> list = Stream.concat(stream1, stream2)
                .map(Film::new)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Film film : list) {
            System.out.println(film);
        }
    }
}

class Film{
    private String name;

    public Film() {
    }

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                '}';
    }
}
