package com.bilibili.UDP.datagram;

import java.io.IOException;
import java.net.*;

public class MulticastSocket_Server {
    public static void main(String[] args) throws IOException {

        //TODO have a mistake , at rows for 14
        InetAddress mcastaddr = InetAddress.getByName("214.0.1.1");
        InetSocketAddress group = new InetSocketAddress(mcastaddr, 23333);
        MulticastSocket s = new MulticastSocket(23333);
        NetworkInterface netIf = s.getNetworkInterface();
        s.joinGroup(group, netIf);
        // get their responses!
        byte[] buf = new byte[1000];
        DatagramPacket recv = new DatagramPacket(buf, buf.length);
        s.receive(recv);
        int length = recv.getLength();
        System.out.println(new String(buf,0,length));
        // OK, I'm done talking - leave the group...
        s.leaveGroup(group, netIf);
    }
}
