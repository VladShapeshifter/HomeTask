package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Vladislav on 10.12.2014.
 */
public class CopyFileStrategyImpl2 implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(s1))) {
            int buf;
            while ((buf = bis.read()) != -1) {
                bos.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
    }
}
