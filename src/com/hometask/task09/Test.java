package com.hometask.task09;

import com.hometask.task08.CopyFileFactoryImpl;

/**
 * Created by Vladislav on 14.12.2014.
 */
public class Test {
    public static void main(String[] args) {
        CopyFileTaskImpl copyFileTask = new CopyFileTaskImpl();
        copyFileTask.setSourceFilePath("path2/file1.txt");
        copyFileTask.setDestinyFilePath("path2/file1copy.txt");
        CopyFileFactoryImpl copyFileFactory= new CopyFileFactoryImpl();
        copyFileFactory.createBufferedCopyFileStrategy().copyFile();
    }
}
