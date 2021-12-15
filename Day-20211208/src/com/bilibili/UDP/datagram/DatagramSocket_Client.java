package com.bilibili.UDP.datagram;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class DatagramSocket_Client {
    public static void main(String[] args) throws IOException {

        //This class represents a socket for sending and receiving datagram packets
        DatagramSocket ds = new DatagramSocket();

        //
//        byte[] bytes = "Happy New Years!".getBytes(StandardCharsets.UTF_8);
        byte[] bytes = "hello".getBytes(StandardCharsets.UTF_8);

        InetAddress ip = InetAddress.getByName("127.0.0.1");
//        InetAddress ip = InetAddress.getByName("255.255.255.255"); //广播

        //This class represents a datagram packet.
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip, 23333);

        ds.send(dp);

        ds.close();
    }
}
