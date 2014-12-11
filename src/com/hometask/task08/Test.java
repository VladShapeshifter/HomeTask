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

        System.out.println("Simple copying started");
        CopyFileStrategyImpl1 copy1 = new CopyFileStrategyImpl1();
        try {
            startTime = System.nanoTime();
            copy1.copyFile("path/fileInput1Impl1.txt", "path/fileOutput1Impl1.txt");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Simlpe - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        File sourceFile1 = new File("path/fileInput2Impl1.txt");
        File outputFile1 = new File("path/fileOutput2Impl1.txt");
        try {
            startTime = System.nanoTime();
            copy1.copyFile(sourceFile1, outputFile1);
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Simple - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        System.out.println("Buffered copying started");
        CopyFileStrategyImpl2 copy2 = new CopyFileStrategyImpl2();
        try {
            startTime = System.nanoTime();
            copy2.copyFile("path/fileInput1Impl2.txt", "path/fileOutput1Impl2.txt");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Buffered - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        File sourceFile2 = new File("path/fileInput2Impl2.txt");
        File outputFile2 = new File("path/fileOutput2Impl2.txt");
        try {
            startTime = System.nanoTime();
            copy2.copyFile(sourceFile2, outputFile2);
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Buffered - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        System.out.println("Channels \"nio\" copying started");
        CopyFileStrategyImpl3 copy3 = new CopyFileStrategyImpl3();
        try {
            startTime = System.nanoTime();
            copy3.copyFile("path/fileInput1Impl3.txt", "path/fileOutput1Impl3.txt");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Channels - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        File sourceFile3 = new File("path/fileInput2Impl3.txt");
        File outputFile3 = new File("path/fileOutput2Impl3.txt");
        try {
            startTime = System.nanoTime();
            copy3.copyFile(sourceFile3, outputFile3);
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Channels - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

        System.out.println("File \"nio\" copying started");
        CopyFileStrategyImpl4 copy4 = new CopyFileStrategyImpl4();
        try {
            startTime = System.nanoTime();
            copy4.copyFile("path/fileInput1Impl4.txt", "path/fileOutput1Impl4.txt");
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("File - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        File sourceFile4 = new File("path/fileInput2Impl4.txt");
        File outputFile4 = new File("path/fileOutput2Impl4.txt");
        try {
            startTime = System.nanoTime();
            copy4.copyFile(sourceFile4, outputFile4);
            elapsedTime = System.nanoTime() - startTime;
            System.out.println("File - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }

    }

}
