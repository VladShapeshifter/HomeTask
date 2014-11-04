package com.hometask.task03;

import java.util.Scanner;

/**
 * Created by Vladislav on 03.11.2014.
 */
public class RecursionFirst {
        static int rec(int nn) {
        return 1 < nn ? nn + rec(nn - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(rec(n));
    }
}
