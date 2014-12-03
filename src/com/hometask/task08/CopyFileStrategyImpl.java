package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.*;

/**
 * Created by bvl on 12/2/2014.
 */
public class CopyFileStrategyImpl implements CopyFileStrategy {
    public void copyFile(String var1, String var2) throws FileAlreadyPresentsException, FileCopyFailedException {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(var1));

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(var2));
            bos.write(bis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyFile(File var1, File var2) throws FileAlreadyPresentsException, FileCopyFailedException {

            var2 = var1;
    }
}
