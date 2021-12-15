package com.bilibili.task;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        用反射调用空参构造去创建一个类对象，用2种方式
//	（分别通过Class对象的方法创建和通过Constructor对象的方法创建）
        Class<?> aClass = Class.forName("com.bilibili.task.Temp");

        //1
        Constructor<?> dc = aClass.getDeclaredConstructor();
        dc.setAccessible(true);
        Temp o = (Temp) dc.newInstance();

        //2
        Temp o1 = (Temp) aClass.newInstance();
    }
}

class Temp{
    public int id;
    private int pwd;

    public Temp() {
    }

    private Temp(int id) {
        this.id = id;
    }

    public Temp(int id, int pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "id=" + id +
                ", pwd=" + pwd +
                '}';
    }

    private void login(){
        System.out.println("hello");
    }
}