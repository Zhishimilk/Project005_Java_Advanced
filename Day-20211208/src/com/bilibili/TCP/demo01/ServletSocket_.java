package com.bilibili.TCP.demo01;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServletSocket_ {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(23333);

        while (true) {
            Socket sk = ss.accept();
            StringBuilder sb = new StringBuilder();
            BufferedInputStream bs = new BufferedInputStream(sk.getInputStream());
            //数据接收容器
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bs.read(bytes)) != -1){
                sb.append(new String(bytes, 0, len));
            }
            System.out.println(sb);
            sk.close();
        }

//        ss.close();
    }
}
