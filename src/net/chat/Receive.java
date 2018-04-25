package net.chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 2:18
 */
public class Receive implements Runnable{
    private DataInputStream dis;    //输入流
    private boolean isRunning = true;   //线程标识

    public Receive(Socket socket) {
        try {
            this.dis = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                dis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * @description:接收数据
     * @param:[]
     * @return:java.lang.String
     */
    public String recevice() {
        String msg = "";
        try {
            msg = dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                dis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return msg;
    }

    @Override
    public void run() {
        while (isRunning) {
            System.out.println(recevice());
        }
    }
}
