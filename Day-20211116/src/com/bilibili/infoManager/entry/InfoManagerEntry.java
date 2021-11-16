package com.bilibili.infoManager.entry;

import com.bilibili.infoManager.controller.StudentController;

import java.util.Scanner;

//学生管理系统入口
public class InfoManagerEntry {
    public static void main(String[] args) {
        loop : while(true) {
            //主系统界面
            System.out.println("-----欢迎使用信息管理系统-----");
            System.out.println("请输入您的选项:        1. 学生管理        2. 老师管理      3. 退出");

            //键盘录入选项
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            //执行用户选择
            switch (choice) {
                case "1" -> new StudentController().start();      //进入学生管理系统
                case "2" -> System.out.println("老师管理系统");     //进入老师管理系统
                case "3"-> {     //退出主管理系统
                    System.out.println("退出成功, 谢谢使用!");
                    break loop;
                }
                default -> System.out.println("你的输入的选项不存在!");
            }
        }
    }
}
