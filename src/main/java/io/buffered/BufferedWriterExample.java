package io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author:cheunyu
 * @date:2018/4/22 16:33
 */
public class BufferedWriterExample {

    public static void main(String[] args) {
        String descPath = "C:/Users/foo/Desktop/[WPF]JJDown/6、提示需要安装.NET 4.0？请先点我.txt";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(descPath, true));
            writer.write("写入文件");
            writer.append("另一种写入");
            writer.newLine(); //换行
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
