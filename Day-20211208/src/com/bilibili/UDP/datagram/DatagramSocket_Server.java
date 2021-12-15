package com.bilibili.UDP.datagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramSocket_Server {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(23333);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            ds.receive(dp);

            System.out.println(new String(bytes, 0, dp.getLength()));
        }

//        ds.close();
    }
}
