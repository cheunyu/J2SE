package io.object;


import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/23 2:13
 */
public class ObjectInputStreamExample {

    public static void main(String[] args) {
        String descPath = "C:/Users/foo/Desktop/新建文件夹/objectoutputstream.txt";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File(descPath)
                            )
                    )
            );
            Object obj = ois.readObject();
            if (obj instanceof Cat) {
                Cat cat = (Cat)obj;
                System.out.println(cat.getName());
                System.out.println(cat.getColor());
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
