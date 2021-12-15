package com.bilibili.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        1). 使用反射获取Student的Class对象。
        Class<?> aClass = Class.forName("com.bilibili.task.Student");
//        2). 获取 “公有、全参构造方法”；
        Constructor<?> dc = aClass.getDeclaredConstructor(String.class, int.class);
//        3). 调用 “公有、全参构造方法”传入：“柳岩”,17两个参数。
        dc.setAccessible(true);
        Object o = dc.newInstance("刘岩", 17);
//        4). 反射获取show()方法
        Method method = aClass.getDeclaredMethod("show");
//        5). 调用show()方法
        method.setAccessible(true);
        method.invoke(o);
    }
}

class Student{
    private String name;
    private int age;
    //公有、无参构造
    public Student() {
    }
    //公有、全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //公有、get/set方法
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
    //......
    //普通成员方法
    void show(){
        System.out.println("大家好，我叫：" + name + " 我今年：" + age + " 岁");
    }
}