package net.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 6:11
 */
public class Server {

    private ServerSocket serverSocket;

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * @description:服务端启动方法
     * @param:[]
     * @return:void
     */
    public void start() {
        try {
            serverSocket = new ServerSocket(8888);
            this.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @description:服务端停止方法
     * @param:[]
     * @return:void
     */
    public void stop() {

    }

    /**
     * @description:服务器接收方法
     * @param:[]
     * @return:void
     */
    public void receive() {
        BufferedReader br = null;
        try {
            Socket client = serverSocket.accept();
            StringBuilder sb = new StringBuilder();
            String msg = null;
            br = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            while ((msg=br.readLine()).length()>0) {
                sb.append(msg);
                sb.append("\r\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
