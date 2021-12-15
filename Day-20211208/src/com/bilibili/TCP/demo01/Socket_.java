package com.bilibili.TCP.demo01;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Socket_ {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Socket sk = new Socket("127.0.0.1", 23333);
            String s = sc.nextLine();
            BufferedOutputStream os = new BufferedOutputStream(sk.getOutputStream());
            os.write(s.getBytes(StandardCharsets.UTF_8));
            os.flush();
            if(s.equals("bye"))
                break;
            sk.close();
        }
    }
}
