package net.chat;

import java.io.IOException;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 1:35
 */
public class ChatClient {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10010);
        new Thread(new Send(client)).start();
        new Thread(new Receive(client)).start();
    }
}
