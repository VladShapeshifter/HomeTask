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
        BufferedOutputStream bos = null;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s1))){
            bos = new BufferedOutputStream(new FileOutputStream(s));
            byte[] buffer = new byte[4096];
            bis.read(buffer);
            bos.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        BufferedOutputStream bos = null;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1))){
            bos = new BufferedOutputStream(new FileOutputStream(file));
            byte[] buffer = new byte[4096];
            bis.read(buffer);
            bos.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
