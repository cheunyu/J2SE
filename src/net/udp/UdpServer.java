package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author:cheunyu
 * @date:2018/4/25 1:06
 */
public class UdpServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(10000);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        server.receive(packet);
        byte[] result = packet.getData();
        String str = new String(result, 0, packet.getLength());
        System.out.println(str);
        server.close();
    }
}
