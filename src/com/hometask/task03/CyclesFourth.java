package com.hometask.task03;

/**
 * Created by Vladislav on 02.11.2014.
 */
public class CyclesFourth {
    static void secCount(int sc){
        int second = sc;
        for (int i = 0; i < 59; i++) {
//            System.out.println(second);
            second++;
            if (second == 59){
                minCount(1);
            }
//            System.out.println(second);
        }
    }
    static void minCount(int mc){//minute count
        int minute = 0;
        mc += mc;
        if (mc < 60) {
            minute++;
            secCount(0);
        }
        if (minute == 59){
            hourCount(1);
        }
//        System.out.println(minute);
    }
    static void hourCount(int hc){//hour count
        int hour = 0;
        hc += hc;
        if (hc < 24) {
            hour++;
            secCount(0);
        }
        if (hour == 23){
            secCount(0);
        }
//        System.out.println(hour);
    }

    public static void main(String[] args) {
        secCount(0);
        int symmetricCounter = 0;
        int sum1;
        int sum2;
        for (;)
        if ()
    }
}

