package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @author:cheunyu
 * @date:2018/4/25 1:10
 */
public class UdpClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket(10001);
        String msg = "客户端发送的数据";
        byte[] bytes = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 10000));
        client.send(packet);
        client.close();
    }
}
