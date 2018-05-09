package io.byteio;

import java.io.File;

/**
 * @author:cheunyu
 * @date:2018/4/22 15:28
 */
public class FolderCopyExample {

    public static void main(String[] args) {
        String srcPath = "C:/Users/foo/Desktop/新建文件夹";
        String descPath = "C:/Users/foo/Desktop/新建文件夹1";
        copyDir(srcPath, descPath);
    }

    public static void copyDir(String srcPath, String descPath) {
        File srcFile = new File(srcPath);
        File descFile = null;
        if (srcFile.isDirectory()) {    //如果是目录构建拷贝目录关系
            descFile = new File(descPath, srcFile.getName());
        }
        copyDir(srcFile, descFile);
    }

    public static void copyDir(File src, File desc) {
        if (src.isFile()) { //是文件，调用文件拷贝
            FileCopyExample.copy(src, desc);
        }else if (src.isDirectory()){   //是目录则创建拷贝目录链
            desc.mkdirs();
            File[] files = src.listFiles(); //遍历原文件夹内容
            for (File f:files) {
                copyDir(f, new File(desc, f.getName()));    //递归拷贝
            }
        }
    }
}
