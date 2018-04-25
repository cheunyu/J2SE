package net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/**
 * @author:cheunyu
 * @date:2018/4/26 4:46
 */
public class ChannelServer  implements Runnable{

    private DataInputStream dis;
    private DataOutputStream dos;
    private boolean isRunning = true;
    private List<ChannelServer> channelServerList = null;


    public ChannelServer(Socket client, List<ChannelServer> channelServerList) {
        try {
            this.channelServerList = channelServerList;
            dis = new DataInputStream(client.getInputStream());
            dos = new DataOutputStream(client.getOutputStream());
            this.channelServerList.add(this);
        } catch (IOException e) {
            e.printStackTrace();
            isRunning = false;
            try {
                dis.close();
                dos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * @description:从客户端接收数据
     * @param:[]
     * @return:java.lang.String
     */
    public String receive() {
        String msg = null;
        try {
            msg = dis.readUTF();
            System.out.println("server收到" + msg);
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

    /**
     * @description:向客户端发送数据
     * @param:[]
     * @return:void
     */
    public void send(String msg) {
        if (msg!=null&&!msg.equals("")) {
            try {
                dos.writeUTF(msg);
                dos.flush();
                System.out.println("server发送");
            } catch (IOException e) {
                e.printStackTrace();
                isRunning = false;
                try {
                    dos.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

        }
    }

    /**
     * @description:向所有客户端发送数据
     * @param:[]
     * @return:void
     */
    public void sendOthers() {
        String msg = receive();
        for (ChannelServer other:channelServerList) {
            if (other == this) {
                continue;
            }
            other.send(msg);
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            sendOthers();
        }

    }
}
