package com.biliibli.treeSet;

import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {

        Student s1 = new Student("zs", 11, 11, 22);
        Student s2 = new Student("ls", 11, 11, 27);
        Student s3 = new Student("ww", 13, 11, 22);

        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        System.out.println(treeSet);
    }
}


class Student implements Comparable<Student>{
    private String name;
    private int ch;
    private int math;
    private int en;

    public Student() {
    }

    public Student(String name, int ch, int math, int en) {
        this.name = name;
        this.ch = ch;
        this.math = math;
        this.en = en;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ch=" + ch +
                ", math=" + math +
                ", en=" + en +
                '}';
    }

    private int getSum() {
        return ch + math + en;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}