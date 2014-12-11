package com.hometask.task08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Vladislav on 03.12.2014.
 */
public class Test {
    public static void main(String[] args) {
        long startTime;
        long elapsedTime;

        CopyFileFactoryImpl copier = new CopyFileFactoryImpl();
        try {
            System.out.println("Simple copying started");
            startTime = System.nanoTime();
            copier.createSimpleCopyFileStrategy().copyFile("path/newPath/fileInput1Impl1.MOV", "path/newPath/fileOutput1Impl1.MOV");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Simple - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

            System.out.println("Buffered copying started");
            startTime = System.nanoTime();
            copier.createBufferedCopyFileStrategy().copyFile("path/newPath/fileInput1Impl2.MOV", "path/newPath/fileOutput1Impl2.MOV");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Buffered - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

            System.out.println("Channels \"nio\" copying started");
            startTime = System.nanoTime();
            copier.createChannelsCopyFileStrategy().copyFile("path/newPath/fileInput1Impl3.MOV", "path/newPath/fileOutput1Impl3.MOV");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Channels - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

            System.out.println("File \"nio\" copying started");
            startTime = System.nanoTime();
            copier.createFilesCopyFileStrategy().copyFile("path/newPath/fileInput1Impl4.MOV", "path/newPath/fileOutput1Impl4.MOV");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("File - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
