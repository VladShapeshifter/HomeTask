package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.*;

/**
 * Created by bvl on 12/2/2014.
 */
public class CopyFileStrategyImpl1 implements CopyFileStrategy {
    public void copyFile(String var1, String var2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try (FileInputStream is = new FileInputStream(var1);
             FileOutputStream os = new FileOutputStream(var2)){
            int buf;
            while ((buf = is.read()) != -1) {
                os.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyFile(File var1, File var2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(var1.getAbsolutePath(), var2.getAbsolutePath());
        /*FileOutputStream os = null;
        try (FileInputStream is = new FileInputStream(var1)) {
            os = new FileOutputStream(var2);
            byte[] buffer = new byte[4096];
            is.read(buffer);
            os.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}
