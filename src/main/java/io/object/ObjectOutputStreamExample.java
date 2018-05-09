package io.object;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/23 2:13
 */
public class ObjectOutputStreamExample {

    public static void main(String[] args) {
        String descPath = "C:/Users/foo/Desktop/新建文件夹/objectoutputstream.txt";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(    //对象输出流，序列化对象
                    new BufferedOutputStream(
                        new FileOutputStream(
                                new File(descPath)
                        )
                    )
            );
            Cat cat = new Cat("hami","whiteblack");
            oos.writeObject(cat);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
