package net;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author:cheunyu
 * @date:2018/4/24 20:02
 */
public class InetSocketAddressExample {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("www.douban.com");
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 100);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getHostString());
        System.out.println(inetSocketAddress.getPort());
        System.out.println(inetSocketAddress.getAddress());
    }
}
