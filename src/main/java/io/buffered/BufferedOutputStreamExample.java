package io.buffered;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/22 16:22
 */
public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        String path = "C:/Users/foo/Desktop/[WPF]JJDown/6、提示需要安装.NET 4.0？请先点我.txt";
        File file = new File(path); //建立联系，新建file对象
        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(file, true));    //使用文件字节流处理，构造方法参数true为追加，false(default)为覆盖
            String str = new String("写入文件中的数据");
            outputStream.write(str.getBytes()); //将字符串转换字节数组
            outputStream.flush(); //强制刷新，close方法会自动flush，这里编写习惯要手动加
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写入失败");
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("回收资源失败");
                }
            }
        }
    }
}
