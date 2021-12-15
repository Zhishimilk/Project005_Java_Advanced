package com.bilibili.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo02 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        编写一个Demo类，定义一个私有方法showString方法,用于打印一条字符串，
//        再编写一个Test类，用键盘输入一个字符串，该字符串是Demo类的全类名，使用反射机制创建该类的对象，
//        并调用该对象中的方法showString

        Class<?> aClass = Class.forName("com.bilibili.task.Demo");

        Method method = aClass.getDeclaredMethod("showString");
        Constructor<?> dc = aClass.getDeclaredConstructor();

        dc.setAccessible(true);
        method.setAccessible(true);

        Object o = dc.newInstance();
        method.invoke(o);
    }
}


class Demo{
    private void showString(){
        System.out.println("happy new year!");
    }
}