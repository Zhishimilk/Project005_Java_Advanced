package com.bilibili.infoManager.controller;

import com.bilibili.infoManager.domain.Student;
import com.bilibili.infoManager.service.StudentService;

import java.util.Scanner;

public class StudentController {

    private static StudentService studentService = new StudentService();

    public void start() {
        loop : while(true) {
            //子系统界面(学生管理系统)
            System.out.println("-----学生管理系统-----");
            System.out.println("1. 添加学生   2. 删除学生   3. 修改学生   4. 查看学生   5. 退出");
            System.out.println("请输入您的选择: ");

            //键盘输入的
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            //执行用户选择
            switch (choice) {
                case "1" -> addStudent();      //添加学生
                case "2" -> studentService.delService();      //删除学生
                case "3" -> studentService.updateService();       //修改学生
                case "4" -> studentService.srcAllService();       //查看所有学生
                case "5" -> {
                    break loop;
                }
                default -> System.out.println("您输入的选项有误!");
            }
        }
    }

    //执行添加命令
    private void addStudent() {
        //键盘录入id
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个新的的 id:");
        String id = sc.nextLine();

        //检查用户输入的 id 是否重复
        if(studentService.checkId(id)){
            System.out.println("您输入的id已存在!");
        }else {
            //键盘录入其他数据
            System.out.println("请输入姓名:");
            String name = sc.nextLine();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            System.out.println("请输入出生日期:");
            String birthday = sc.next();

            //将数据封装为Student类
            Student student = new Student(id, name, age, birthday);

            //添加并返回结果
            boolean result = studentService.addService(student);
            if(result){
                System.out.println("添加成功!");
            }else {
                System.out.println("存储已达上线上限!");
            }
        }
    }
}
