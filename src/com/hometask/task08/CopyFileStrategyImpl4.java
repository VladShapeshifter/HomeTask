package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Vladislav on 10.12.2014.
 */
public class CopyFileStrategyImpl4 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        File file1 = new File(s);
        File file2 = new File(s1);
        try {
            Files.copy(file1.toPath(), file2.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            Files.copy(file.toPath(), file1.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
