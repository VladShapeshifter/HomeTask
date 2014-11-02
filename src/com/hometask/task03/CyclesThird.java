package com.hometask.task03;

/**
 * Created by Vladislav on 01.11.2014.
 */
public class CyclesThird {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (int ticket = 1; ticket < 999999; ticket++) {
            i = ticket / 1000;
            int sum1 = 0;
            int sum2 = 0;
            while (i!=0) {
                sum1 += (i % 10);
                i /= 10;
            }
            i = ticket % 1000;
            while (i!=0) {
                sum2 += (i % 10);
                i /= 10;
            }
            if (sum2 == sum1){
            j++;
                System.out.println("Lucky ticket №: " + j + " is " + ticket);
            }
        }
        System.out.println("There are " + j + " lucky tickets in one roll.");
    }
}
