package net.udp;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author:cheunyu
 * @date:2018/4/25 17:42
 */
public class UdpDoubleServer {

    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(10000);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        server.receive(packet);
        double d = convert(packet.getData());
        System.out.println(d);
    }

    public static Double convert(byte[] datas) throws IOException {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datas));
        double d = dis.readDouble();
        dis.close();
        return d;
    }
}
