package io;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/23 3:20
 */
public class CloseableExample {

    public static void close(Closeable... io) {
        for (Closeable c:io) {
            try {
                if (null != c)
                    c.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
