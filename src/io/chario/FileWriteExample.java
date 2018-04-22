package io.chario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author:cheunyu
 * @date:2018/4/22 14:56
 */
public class FileWriteExample {

    public static void main(String[] args) {
        String descPath = "C:/Users/foo/Desktop/新建文件夹/test1.txt";
        Writer writer = null;
        try {
            writer = new FileWriter(descPath, true);
            writer.write("写入文件");
            writer.append("另一种写入");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null!=writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
