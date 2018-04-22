package io.data;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/23 0:15
 */
public class DataInputStreamExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/新建文件夹/dis.txt";
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(srcPath))));
            System.out.println(dis.readUTF());
            System.out.println(dis.read());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
