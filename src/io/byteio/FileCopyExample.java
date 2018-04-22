package io.byteio;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/21 23:47
 * @deprecated 文件拷贝
 */
public class FileCopyExample {

    public static void main(String[] args) {
        String path = "C:/Users/foo/Desktop/新建文件夹/test1.txt";
        String path2 = "C:/Users/foo/Desktop/新建文件夹/test1.txt";
        copy(path, path2);
    }

    public static void copy(String path, String path2) {
        File file = new File(path);
        File file2 = new File(path2);
        copy(file, file2);
    }

    public static void copy(File file, File file2) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file2,true);
            byte[] bytes = new byte[1024];
            int len = 0;
            while (-1!=(len = inputStream.read(bytes))) {
                outputStream.write(bytes, 0 ,len);  //防止最后一次byte数组内容尾部有空值，即输入流读出多少，输出流写入多少
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 先打开的后关闭原则。先关闭输出流吗，再关闭输入流
            if (outputStream != null ) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null ) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
