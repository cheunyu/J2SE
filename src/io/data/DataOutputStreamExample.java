package io.data;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/23 0:44
 */
public class DataOutputStreamExample {

    public static void main(String[] args) throws FileNotFoundException {
        String descPath = "C:/Users/foo/Desktop/新建文件夹/dis.txt";
        String str = "String 字符串";
        int i = 123;
        Double d = 23123.12445d;
        Long l = 12355634L;
        char c = 'c';
        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                new File(descPath))));
        try {
            dos.writeUTF(str);
            dos.write(i);
            dos.writeDouble(d);
            dos.writeLong(l);
            dos.flush();
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
