package com.hometask.task09;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.util.ArrayList;
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
        File file = new File(directory);
        // Find all files in the directory
        if (s.contains("*")) {
            String[] listOfAll1 = file.list();
            for (String printAll : listOfAll1) {
                System.out.println(printAll);
            }
        }
        // Find files with one character file name
        if (s.contains("?")) {
            String[] listOfOne1 = file.list();
            ArrayList arrayListOne = new ArrayList();
            for (String printOne1 : listOfOne1) {
                if (printOne1.length() == 1) {
                    arrayListOne.add(printOne1);
                }
            }
            String[] listOfOne2 = new String[arrayListOne.size()];
            arrayListOne.toArray(listOfOne2);
            for (String printOne2 : listOfOne2) {
                System.out.println(printOne2);
            }
        }
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
