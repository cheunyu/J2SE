package net.socket;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 1:19
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);
        Socket socket = server.accept();    //阻塞监听
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        socket.getOutputStream()
                )
        );
        bw.write("server data");
        bw.newLine();
        bw.flush();
    }
}
