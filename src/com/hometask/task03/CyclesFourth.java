package com.hometask.task03;

/**
 * Created by Vladislav on 02.11.2014.
 */
public class CyclesFourth {

    static int second = 0;
    static int minute = 0;
    static int hour = 0;
    static int hourr;
    static int minutee;
    static int simmetric;
    static int chek = 1;

    {
    /*static void secCount(int sc){

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


        if (hc < 24) {
            hour++;
            secCount(0);
        }
        if (hour == 23){
            secCount(0);
        }

//        System.out.println(hour);
    }*/
    }

    static void secondsGenerator(int s){
        if (chek > 0){
            second = s;
            for (int g = 1; g < 61; g++) {
                second++;
                System.out.println("S "+second);
                if (second == 60) {
                    minuteCounter(1);
                }

            }
        } else System.out.println("Конец дня.");
    }
    static void minuteCounter(int m){
        if (m > 0){
            minute++;
            System.out.println("M "+minute);
            if (minute < 60) {
                secondsGenerator(0);
            }
            if (minute == 60){
                hourCounter(1);
            }

        }
    }
    static void hourCounter(int h){
        hour+=1;
        if (h < 24){

            System.out.println("H "+hour);
//            if (hour < 24){
//                secondsGenerator(0);
//            }
            if (hour == 24){
            chek = 0;
            }

        }
    }

    static void simmetric(int hours, int minutes){
        if (hours!=0){
            hourr = hours%10;
            hours/=10;
            System.out.println(hours+" "+hourr);
        }
        if (minutes!=0){
            minutee = minutes%10;
            minutes/=10;
            System.out.println(minutes+" "+minutee);
        }
        if (hours == minutes && hourr == minutee || hours == minutee && hourr == minutes){
            simmetric++;
            System.out.println("Simmetric: " + simmetric);
        }
    }

    public static void main(String[] args) {
        secondsGenerator(0);
//        simmetric(hour, minute);
    }
}

