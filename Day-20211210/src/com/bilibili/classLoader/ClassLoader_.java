package com.bilibili.classLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ClassLoader_ {
    public static void main(String[] args) throws IOException {
        InputStream ras = ClassLoader_.class.getClassLoader().getResourceAsStream("prop.properties");
        BufferedReader br = new BufferedReader(new InputStreamReader(ras, "UTF-8"));
        Properties prop = new Properties();
        prop.load(br);
        System.out.println(prop);

        String id = prop.getProperty("id");
        String pwd = prop.getProperty("pwd");

        System.out.println("id: "+id +" "+"pwd:  " +pwd);
    }
}
