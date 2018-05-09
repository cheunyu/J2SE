package net.chat;

import net.socket.SocketServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/4/26 1:32
 */
public class ChatServer {

    private static List<ChannelServer> channelServerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10010);

        while (true) {
            Socket client = server.accept();
            ChannelServer channelServer = new ChannelServer(client, channelServerList);
            new Thread(channelServer).start();
        }
    }
}
