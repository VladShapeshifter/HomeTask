package com.hometask.task03;

import java.util.Scanner;

/**
 * Created by Vladislav on 03.11.2014.
 */
public class RecursionFirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int res = 0;
        while (i <= n) {
            res += i;
            i++;
        }
        System.out.println(res);
    }
}
