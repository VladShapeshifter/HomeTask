package com.hometask.task02;

/**
 * Created by Vladislav on 31.10.2014.
 */
public class Fourth {
    public static void main(String[] args) {
        int a = Integer.parseInt("1000000100", 2) - Integer.parseInt("101010001", 2);
        System.out.println(Integer.toBinaryString(a));

        int b = Integer.parseInt("1010111101", 2) - Integer.parseInt("111000010", 2);
        System.out.println(Integer.toBinaryString(b));

        int c1 = Integer.parseInt("1101000000", 2);
        int c2 = Integer.parseInt("01", 2);
        int c3 = Integer.parseInt("1001011010", 2);
        int c4 = Integer.parseInt("011", 2);
        int c5 = c1 - c3;
        int c6 = c2 - c4;
        System.out.println(Integer.toBinaryString(c5) + "." + Integer.toBinaryString(c6));

        int d1 = Integer.parseInt("2023", 8);
        int d2 = Integer.parseInt("5", 8);
        int d3 = Integer.parseInt("527", 8);
        int d4 = Integer.parseInt("4", 8);
        int d5 = d1 - d3;
        int d6 = d2 - d4;
        System.out.println(Integer.toOctalString(d5) + "." + Integer.toOctalString(d6));

        int e1 = Integer.parseInt("25E", 16);
        int e2 = Integer.parseInt("6", 16);
        int e3 = Integer.parseInt("1B1", 16);
        int e4 = Integer.parseInt("5", 16);
        int e5 = e1 - e3;
        int e6 = e2 - e4;
        System.out.println(Integer.toHexString(e5) + "." + Integer.toHexString(e6));
    }
}
