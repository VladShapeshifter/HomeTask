package com.hometask.task03;

/**
 * Created by Vladislav on 03.11.2014.
 */
public class ArraySecond {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        int max = 0;
        int index = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*11 -5) ;
                max = max + Math.abs(arr[i][j]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");

            if (max > temp) {
                index = i + 1;
                temp = max;
            }
        }
        System.out.println("String number: " + index);
    }
}
