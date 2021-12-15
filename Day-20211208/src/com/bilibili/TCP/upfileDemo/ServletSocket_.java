package com.bilibili.TCP.upfileDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServletSocket_ {
    public static void main(String[] args) throws IOException {
        /**
         * 1.创建服务器端接收请求
         * 2.读取网络数据流中的文件字节数据到服务器内存中
         * 3. 将读取到的数据写入本地硬盘中默认的文件路径
         */

        //1
        ServerSocket serverSocket = new ServerSocket(23333);
        while (true) {
            Socket accept = serverSocket.accept();

            //2&3
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\zhish\\Desktop\\temp\\"+UUID.randomUUID()+".jpg"));
            int b;
            while((b=bis.read())!=-1){
                bos.write(b);
            }
            bos.close();
            accept.close();
        }
    }
}
