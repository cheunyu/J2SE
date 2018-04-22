package io.bytearray;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author:cheunyu
 * @date:2018/4/22 20:34
 */
public class ByteArrayInputStreamExample {

    public static void main(String[] args) throws IOException {
        String data = "test data 123456789asdfghjkl;";
        byte[] bytes = data.getBytes(); //模拟外部资源
        InputStream byteArrayInputStream =  new BufferedInputStream(new ByteArrayInputStream(bytes));
        byte[] flush = new byte[1024];
        int len = 0;
        while (-1!=(len = byteArrayInputStream.read(flush))) { //读外部数据打印
            String str = new String(flush, 0, len);
            System.out.println(str);
        }
        byteArrayInputStream.close();
    }
}
