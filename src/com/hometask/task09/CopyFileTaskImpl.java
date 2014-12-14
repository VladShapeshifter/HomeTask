package com.hometask.task09;

import com.hometask.task08.CopyFileFactoryImpl;
import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.util.concurrent.Executors;

/**
 * Created by Vladislav on 12.12.2014.
 */
public class CopyFileTaskImpl implements CopyFileTask {
    private CopyFileStrategy tempCopyFileStrategy;
    private String sourceFilePath;
    private String destinyFilePath;
    private int tryCount;
    @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        tempCopyFileStrategy = copyFileStrategy;
    }

    @Override
    public void setSourceFilePath(String s) {
        sourceFilePath = s;
    }

    @Override
    public void setDestinyFilePath(String s) {
        destinyFilePath = s;
    }

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        Executors.newSingleThreadExecutor();
    }
}
