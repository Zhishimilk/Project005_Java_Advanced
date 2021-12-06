package com.bilibili.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo07 {
//    现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用Stream方式进行以下若干操作步骤：
//            两个队伍（集合）的代码如下：
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
//     1. 第一个队伍只要名字为3个字的成员姓名;
//     2. 第一个队伍筛选之后只要前6个人;
        Stream<String> stream1 = one.stream().filter(s -> s.length() == 3).limit(6);
//     3. 第二个队伍只要姓张的成员姓名;
//     4. 第二个队伍筛选之后不要前1个人;
        Stream<String> stream2 = two.stream().filter(s -> s.startsWith("张")).skip(1);
//     5. 将两个队伍合并为一个队伍;
//     6. 根据姓名创建Student对象;
//     7. 打印整个队伍的Student对象信息.
        ArrayList<Student> students = Stream.concat(stream1, stream2)
                .map(Student::new)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student{
    private String name;

    public Student() {
    }

    public Student(String name) {
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
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
