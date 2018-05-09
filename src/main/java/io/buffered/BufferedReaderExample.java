package io.buffered;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/22 16:24
 */
public class BufferedReaderExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/[WPF]JJDown/5、提示需要安装.NET 4.0？请先点我.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(srcPath));
            String line = null;
            while (null!=(line = reader.readLine())) {
                System.out.println(line);
            }
            /*
            int len = 0;
            char[] flush = new char[1024];
            while (-1!=(len=reader.read(flush))) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
            */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
