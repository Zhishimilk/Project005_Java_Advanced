package com.bilibili.file.task;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) throws IOException {
//        请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，每条信息存储一行。
//        当用户输入：”886”时，程序结束。

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(s.equals("886")) {
                bos.close();
                break;
            }
            bos.write(s.getBytes(StandardCharsets.UTF_8));
            bos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }
    }
}
