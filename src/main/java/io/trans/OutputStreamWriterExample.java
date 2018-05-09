package io.trans;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/22 20:06
 */
public class OutputStreamWriterExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/[WPF]JJDown/6、提示需要安装.NET 4.0？请先点我.txt";
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(srcPath), true),"utf-8"));
            bufferedWriter.write("写入数据");
            bufferedWriter.newLine(); //换行
            bufferedWriter.write("继续写人");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedWriter) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
