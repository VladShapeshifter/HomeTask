package com.hometask.task08;

import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.File;

/**
 * Created by Vladislav on 03.12.2014.
 */
public class Test {
    public static void main(String[] args) {
        try {
            CopyFileStrategyImpl copy = new CopyFileStrategyImpl();
            File file1 = new File("SourceFile.txt");
            System.out.println(file1.canRead());
            File file2 = new File("task08", "DestFile.txt");
            System.out.println(file2.canWrite());
            copy.copyFile(file1, file2);
        } catch (FileAlreadyPresentsException e) {
            e.printStackTrace();
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

    }

}
