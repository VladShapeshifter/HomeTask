package com.hometask.task02;

/**
 * Created by Vladislav on 30.10.2014.
 */
public class Third {
    public static void main(String[] args) {
        int a = Integer.parseInt("1110101010", 2) + Integer.parseInt("10111001", 2);
        System.out.println(Integer.toBinaryString(a));

        int b = Integer.parseInt("10111010", 2) + Integer.parseInt("10010100", 2);
        System.out.println(Integer.toBinaryString(b));

        int c1 = Integer.parseInt("111101110", 2);
        int c2 = Integer.parseInt("1011", 2);
        int c3 = Integer.parseInt("1111011110", 2);
        int c4 = Integer.parseInt("1", 2);
        int c5 = c1 + c3;
        int c6 = c2 + c4;
        System.out.println(Integer.toBinaryString(c5) + "." + Integer.toBinaryString(c6));

        int d1 = Integer.parseInt("1153", 8);
        int d2 = Integer.parseInt("2", 8);
        int d3 = Integer.parseInt("1147", 8);
        int d4 = Integer.parseInt("32", 8);
        int d5 = d1 + d3;
        int d6 = d2 + d4;
        System.out.println(Integer.toOctalString(d5) + "." + Integer.toOctalString(d6));

        int e1 = Integer.parseInt("40F", 16);
        int e2 = Integer.parseInt("4", 16);
        int e3 = Integer.parseInt("160", 16);
        int e4 = Integer.parseInt("4", 16);
        int e5 = e1 + e3;
        int e6 = e2 + e4;
        System.out.println(Integer.toHexString(e5) + "." + Integer.toHexString(e6));
    }
}
