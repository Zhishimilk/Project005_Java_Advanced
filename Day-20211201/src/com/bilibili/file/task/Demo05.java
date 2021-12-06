package com.bilibili.file.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Demo05 {
    public static void main(String[] args) throws IOException {
//        1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
//        2. user.txt文件中初始存放的用户信息有如下：
//        jack,123
//        rose,123
//        tom,123
//        3.要求完成如下功能：
//        程序运行时：控制台提示用户输入注册的用户名和密码；
//        验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
//        是：控制台提示：用户名已存在
//        否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；

        Scanner sc = new Scanner(System.in);

        System.out.println("创建用户名:");
        String username = sc.nextLine();


        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt");
        prop.load(fis);

        boolean flag = false;

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            if(key.contains(username)) {
                flag = true;
                break;
            }
        }
        fis.close();

        if(flag){
            System.out.println("用户名已存在!");
        }else {
            System.out.println("创建密码:");
            String password = sc.nextLine();
            prop.setProperty(username, password);
            FileOutputStream fos = new FileOutputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt");
            prop.store(fos, "add");
            fos.close();
        }
    }
}
