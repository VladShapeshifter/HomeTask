package com.hometask.task03;

/**
 * Created by Vladislav on 01.11.2014.
 */
public class CyclesThird {
    public static void main(String[] args) {
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int ticket = 1; ticket < 999999; ticket++) {
            i = ticket;
            i /= 1000;
            sum1 += (i % 1000);
            sum2 += i;

            if (sum2 == sum1){
            System.out.println(ticket);
            }
        }
    }
}
