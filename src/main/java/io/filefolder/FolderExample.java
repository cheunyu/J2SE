package io.filefolder;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author:cheunyu
 * @date:2018/4/21 16:08
 */
public class FolderExample {

    public static void main(String[] args) {
        String path = "d:/photo";
        String path2 = "d:/photo/test/test";
        File file = new File(path);
        File file2 = new File(path2);
        file2.mkdir();  //新建文件夹
        file2.mkdirs();  //新建文件夹，包含目录链多层一并构建
        String[] files = file.list();   //返回目录下所有文件名
//        for (String filename:files) {
//            System.out.println(filename);
//        }
        File[] fileArray = file.listFiles();    //返回目录下所有文件对象
//        for (File f:fileArray) {
//            System.out.println(f.getAbsolutePath());
//        }

        fileArray = file.listFiles(new FilenameFilter(){    //文件名过滤器

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".ini") && new File(dir, name).isFile();   //后缀名为ini且是文件非目录
            }

        });
        for (File f:fileArray) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
