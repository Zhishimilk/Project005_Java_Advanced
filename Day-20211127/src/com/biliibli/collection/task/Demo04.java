package com.biliibli.collection.task;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo04 {
    public static void main(String[] args) {
//        分别用Comparable和Comparator两个接口对下列四位同学的年龄做升序排序，
//        如果年龄一样，那在年龄排序的基础上按照姓名字符串长度降序排序。
//        姓名（String）	年龄（int）
//        zhangsan		20
//        lisi			22
//        wangwu			20
//        zhaoliu			22
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 20);
        Student s4= new Student("zhaoliu", 22);

        TreeSet<Student> ts = new TreeSet<>((o1, o2) -> {
            int result = o2.getAge() - o1.getAge();
            return result == 0 ? o2.getName().length() - o1.getName().length() : result;
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.age - o.age;
        return result == 0 ? this.name.length() - o.name.length() : result;
    }
}
