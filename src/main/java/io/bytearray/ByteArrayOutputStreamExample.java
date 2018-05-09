package io.bytearray;


import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/22 20:42
 */
public class ByteArrayOutputStreamExample {

    public static void main(String[] args) {
        byte[] descBytes = new byte[1024];  //模拟外部资源
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String data = "test data 123456789asdfghjkl;";  //本地资源
        byte[] srcBytes = data.getBytes();
        try {
            byteArrayOutputStream.write(srcBytes, 0, srcBytes.length);
            descBytes = byteArrayOutputStream.toByteArray();
            System.out.println(new String(srcBytes));
        } finally {
            if (null != byteArrayOutputStream) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
