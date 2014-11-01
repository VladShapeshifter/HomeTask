package com.hometask.task03;

/**
 * Created by Vladislav on 01.11.2014.
 */
public class CyclesSecond {
    public static void main(String[] args) {
        int sum = 0;
        int tek = 1;
        int pred = 1;
        for (int i = 0; i < 9; i++){
            /*for (int pred = 1; tek >= pred; tek = sum) {
                sum = tek + pred;
                pred = tek;
                if (pred == 1){
                    System.out.println(pred);
                }
                if (tek == 1){
                    System.out.println(tek);
                }
                System.out.println(sum);*/

            sum = tek + pred;
            pred = tek;
            if (pred == 1){
                System.out.println(pred);
            }
            if (tek == 1){
                System.out.println(tek);
            }
            tek = sum;
            System.out.println(sum);
            //}

        }
    }
}
// 1 1 2(pred) 3(tek) 5 8...