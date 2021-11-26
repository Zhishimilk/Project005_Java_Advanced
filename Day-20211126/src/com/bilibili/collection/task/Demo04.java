package com.bilibili.collection.task;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
//        第4题：分析以下需求，并用代码实现
//        1.	定义Student类
//        属性:
//        姓名：String name
//        年龄：int age
//        成绩：int score
//        行为:
//        空参构造方法
//                有参构造方法
//        set和get方法
//                toString方法
//        2.	定义测试类,进行测试
//                (1)创建10个学生对象存入ArrayList集合中
//                (2)打印最高分的学员姓名、年龄、成绩  	[要求封装1个方法  参数是集合对象   返回值类型为Student]
//        (3)打印10个学生的总成绩和平均分		 	[要求封装两个方法完成]
//        (4)打印不及格的学员信息及数量		 	[要求封装一个方法完成]

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Student("张"+ i, i+10, i*10));
        }
        Student stu = high(list);
        System.out.println(stu);
        int sum = sumScore(list);
        System.out.println(sum);
        double avg = avgScore(list);
        System.out.println(avg);
        printLow(list);
    }

    private static void printLow(ArrayList<Student> list) {
        int count = 0;
        for (Student student : list) {
            if(student.getScore() < 60){
                System.out.println(student);
                count++;
            }
        }
        System.out.println(count);
    }

    private static double avgScore(ArrayList<Student> list) {
        return (double) sumScore(list) / list.size();
    }

    private static int sumScore(ArrayList<Student> list) {
        int sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        return sum;
    }

    private static Student high(ArrayList<Student> list) {
        Student max = list.get(0);
        for (Student student : list) {
            if(max.getScore() < student.getScore())
                max = student;
        }
        return max;
    }
}

class Student{
        private String name;
        private int age;
        private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
