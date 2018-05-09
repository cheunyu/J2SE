package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author:cheunyu
 * @date:2018/4/24 19:58
 */
public class InetAddressExample {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.douban.com");
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

    }
}
