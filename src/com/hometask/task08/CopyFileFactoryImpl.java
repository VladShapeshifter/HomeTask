package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * Created by Vladislav on 10.12.2014.
 */
public class CopyFileFactoryImpl implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        return new CopyFileStrategy() {
            @Override
            public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
                try (FileInputStream is = new FileInputStream(s);
                     FileOutputStream os = new FileOutputStream(s1)) {
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

            @Override
            public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
                copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
            }
        };
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategy() {
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
        };
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategy() {
            @Override
            public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
                try (FileChannel in = new FileInputStream(s).getChannel();
                     FileChannel out = new FileOutputStream(s1).getChannel()){
                    out.transferFrom(in, 0, in.size());
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
        };
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategy() {
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
        };
    }
}
