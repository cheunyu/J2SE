package io.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author:cheunyu
 * @date:2018/4/22 14:46
 */
public class FileReaderExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/新建文件夹/test.txt";
        Reader reader = null;
        try {
            reader = new FileReader(srcPath);
            int len = 0;
            char[] flush = new char[1024];
            while (-1!=(len=reader.read(flush))) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
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
