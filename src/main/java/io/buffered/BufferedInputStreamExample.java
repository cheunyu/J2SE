package io.buffered;

import java.io.*;

/**
 * @author:cheunyu
 * @date:2018/4/22 16:18
 */
public class BufferedInputStreamExample {

    public static void main(String[] args) {
        String path = "C:/Users/foo/Desktop/[WPF]JJDown/5、提示需要安装.NET 4.0？请先点我.txt";
        File file = new File(path); //建立与文件的联系，new文件对象
        BufferedInputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));    //使用FileInputStream提升作用域
            byte[] bytes = new byte[1024];  //缓冲数据
            while (-1!=inputStream.read(bytes)) {   //从文件读取存放缓冲数组，当read方法返回-1表示从文件无数据可读
                String str = new String(bytes); //将缓冲字节数组构造字符串
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取失败");
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭流失败");
            }
        }
    }
}
