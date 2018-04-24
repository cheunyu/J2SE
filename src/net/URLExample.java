package net;

import java.io.*;
import java.net.URL;

/**
 * @author:cheunyu
 * @date:2018/4/24 22:21
 */
public class URLExample {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.gooogle.com:80/index.html#aa?pwd=test");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getRef());
        System.out.println(url.getQuery());

        url = new URL("https://www.douban.com");

        BufferedReader bis = new BufferedReader(
                new InputStreamReader(
                        url.openStream()
                )
            );
        String html = null;
        while ((html = bis.readLine())!=null) {
            System.out.println(html);
        }

        bis.close();
    }
}
