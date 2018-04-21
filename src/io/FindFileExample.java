package io;

import java.io.File;

/**
 * @author:cheunyu
 * @date:2018/4/21 17:21
 */
public class FindFileExample {
    public static void main(String[] args) {
        String path = "d:/photo";
        File file = new File(path);
        printName(file);
        File[] fileArrays = File.listRoots();
        for (File f:fileArrays) {
            printName(f);
        }
    }

    public static void printName(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        System.out.println(file.getAbsolutePath());
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File f:fileArray) {
                    printName(f);
                }
            }

        }
    }
}
