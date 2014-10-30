package com.hometask.task02;

/**
 * Created by Vladislav on 30.10.2014.
 */
public class Second {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("111000111", 2));
        System.out.println(Integer.parseInt("100011011", 2));
        System.out.println(Integer.parseInt("1001100101", 2) + "." + Integer.parseInt("1001", 2));
        System.out.println(Integer.parseInt("1001001", 2) + "." + Integer.parseInt("011", 2));
        System.out.println(Integer.parseInt("335", 8) + "." + Integer.parseInt("7", 8));
        System.out.println(Integer.parseInt("14C", 16) + "." + Integer.parseInt("A", 16));
    }
}
