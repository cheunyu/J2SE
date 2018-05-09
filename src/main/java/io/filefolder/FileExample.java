package io.filefolder;

import java.io.File;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/21 14:36
 */
public class FileExample {

    public static void main(String[] args) throws IOException{
        String path = "c:/Windows";
        String path2 = "test";
        String path3 = "test";
        File file = new File(path);
        File file2 = new File(path2);
        File file3 = new File(path3);
        System.out.println("文件绝对路径====>" + file.getAbsolutePath()); //返回绝对路径
        System.out.println("文件绝对路径====>" + file2.getPath());    //绝对路径返回绝对路径，相对路径返回相对路径
        System.out.println("文件上级路径====>" + file.getParent());   //返回文件上级路径
        boolean flag = file.exists();   //存在返回真，不存在返回假
        System.out.println(flag?"文件存在":"文件不存在");
        boolean fileFlag = file.isFile();   //文件返回真，文件夹返回假
        System.out.println(fileFlag?"是文件":"是文件夹");
        boolean fileRead = file.canRead();  //文件可读返回真，不可读返回假
        System.out.println("文件可读====>" + fileRead);
        boolean fileWrite = file.canWrite();  //文件可写返回真，不可写返回假
        System.out.println("文件可写====>" + fileWrite);
        boolean file2NewFile =file2.createNewFile();   //新建文件返回真，已存在返回假
        System.out.println(file2NewFile?"新建文件成功":"文件已存在");
        boolean file2del =file2.delete();   //删除文件成功返回真，失败返回假
        System.out.println(file2del?"删除文件成功":"删除文件失败");
        File tmpFile = File.createTempFile("tmpfile",".tmp",new File("d:/"));   //新建临时文件
        tmpFile.deleteOnExit();  //程序退出时删除临时文件

        file3.createNewFile();
        boolean fileDirectory = file3.isDirectory();    //file是目录返回真，不是返回假
        System.out.println(fileDirectory);
    }
}
