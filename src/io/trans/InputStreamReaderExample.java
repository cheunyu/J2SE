package io.trans;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/22 19:28
 */
public class InputStreamReaderExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/[WPF]JJDown/5、提示需要安装.NET 4.0？请先点我.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File(srcPath)
                            ),
                            "utf-8")
            );
            String line = null;
            while (null!=(line = bufferedReader.readLine())) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}