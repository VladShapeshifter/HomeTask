package com.hometask.task03;

import java.util.Arrays;

/**
 * Created by Vladislav on 03.11.2014.
 */
public class ArrayFirst {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*90+10) ;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}