package net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 1:23
 */
public class SockeetClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",10000);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        socket.getInputStream()
                )
        );
        String data = br.readLine();
        System.out.println(data);
    }
}
