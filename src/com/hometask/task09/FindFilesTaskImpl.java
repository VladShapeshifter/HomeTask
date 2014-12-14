package com.hometask.task09;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.concurrent.Executors;

/**
 * Created by Vladislav on 12.12.2014.
 */
public class FindFilesTaskImpl implements FindFilesTask {
    private String directory;
    private String fileNameSearchString;
    private PrintStream ps;
    private int tryCount;
    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {
        directory = s;
    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {
        fileNameSearchString = s;
    }

    @Override
    public void setPrintStream(PrintStream printStream) {
        ps = printStream;
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
