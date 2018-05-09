package net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @author:cheunyu
 * @date:2018/4/25 17:48
 */
public class UdpDoubleClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket(10001);
        double data = 8787623.123d;
        DatagramPacket packet = new DatagramPacket( convert(data),  convert(data).length, new InetSocketAddress("localhost",10000));
        client.send(packet);
        client.close();
    }

    public static byte[] convert(double d) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeDouble(d);
        dos.flush();
        byte[] data = bos.toByteArray();
        dos.close();
        return data;
    }
}
