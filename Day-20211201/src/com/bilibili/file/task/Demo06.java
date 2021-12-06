package com.bilibili.file.task;

import java.io.*;
import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) throws IOException {
//        需求 : 项目根路径下有text.txt文件，内容如下
//        我爱黑马
//        123456
//
//        利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中
//        654321
//        马黑爱我

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));

        ArrayList<Integer> list = new ArrayList<>();
        int c;
        while((c = br.read()) != -1){
               list.add(c);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\zhish\\Desktop\\temp\\temp.txt"));
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
        }
        bw.close();
    }
}
