package com.bilibili.file.task;

import java.io.*;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) throws IOException {
//        实现一个验证码小程序，要求如下：
//        1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
//        2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));

        for (int i = 0; i < 3; i++) {
            System.out.println("录入验证码:");
            bw.write(sc.nextLine());
            bw.newLine();
        }
        bw.close();

        System.out.println("检验验证码:");
        String s = sc.nextLine();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        String read;
        boolean flag = false;
        while((read = br.readLine()) != null){
            if (s.equals(read)) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("检验成功!");;
        }else {
            System.out.println("检验失败!");
        }
        br.close();
    }
}
