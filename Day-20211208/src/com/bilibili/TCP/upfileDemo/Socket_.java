package com.bilibili.TCP.upfileDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Socket_ {
    public static void main(String[] args) {
        /**
         *   1.创建客户端连接服务器
         *   2.选择要上传的文件(键盘录入文件的路径)
         *   3.读取指定路径的文件字节数据到客服端内存中
         *   4.将读取到的数据写入网络数据流中发送到服务器
         *   5.关闭资源
         */
        Socket socket = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                //2
                System.out.println("请输入要上传的文件路径:");
                String path = sc.nextLine();

                //1
                socket = new Socket("127.0.0.1", 23333);

                //3&4
                bis = new BufferedInputStream(new FileInputStream(path));
                bos = new BufferedOutputStream(socket.getOutputStream());
                int b;
                while((b=bis.read()) != -1){
                    bos.write(b);
                }
                bos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                //5
                if(bis!=null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(socket!=null) {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
