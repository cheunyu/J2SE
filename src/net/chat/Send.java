package net.chat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author:cheunyu
 * @date:2018/4/26 2:01
 */
public class Send implements Runnable{

    private BufferedReader console; //控制台输入流
    private DataOutputStream dos;   //管道输出流
    private Boolean isRunning = true;   //线程标识

    public Send() {
        this.console = new BufferedReader(new InputStreamReader(System.in));
    }

    public Send(Socket client) {
        this();
        try {
            this.dos = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                dos.close();
                console.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * @description:从控制台接收数据
     * @param:[]
     * @return:java.lang.String
     */
    private String getMsgFromConsole() {
        try {
            return console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * @description:发送数据
     * @param:[]
     * @return:void
     */
    public void send(){
        String msg = getMsgFromConsole();
        if (msg!=null&&!msg.equals("")) {
            try {
                dos.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
                isRunning = false;
                try {
                    dos.close();
                    console.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            send();
        }
    }
}
