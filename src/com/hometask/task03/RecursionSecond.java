package com.hometask.task03;

import java.util.Scanner;

/**
 * Created by bvl on 11/3/2014.
 */
public class RecursionSecond {
    static int i = 0;
    static int rec(int nn) {
        if (nn == 4){
            i++;
        }
        if (nn == 1){
            return 1;
        }
        else if (nn == 2){
            return 1;
        }
        return rec(nn - 1) + rec(nn - 2);
    }

    public static void main(String[] args) {
        for (int y = 1; y <16; y++){
//            System.out.println(rec(y));
            rec(y);
        }
        System.out.println(i);
    }
}

// 1 1 2 3 5 8 13 21 34 55 89
// 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
// 13 11 9 7 5 3 1