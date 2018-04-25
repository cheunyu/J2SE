package net.chat;

import net.socket.SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 1:32
 */
public class ChatServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10010);
        Socket client = server.accept();
        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        while (true) {
            String msg = dis.readUTF();
            System.out.println("server接收:" + msg);
            dos.writeUTF("service发送:" + msg);
            dos.flush();
        }
    }
}
