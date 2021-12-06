package com.bilibili.file;

import java.util.Properties;
import java.util.Set;

public class Properties_ {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("张信哲", "<白月光>");
        prop.setProperty("cocoa", "<loser>");

        System.out.println(prop.getProperty("cocoa"));
        System.out.println("--------------------");

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key+"->"+prop.getProperty(key));
        }
    }
}
