package com.hometask.task02;

/**
 * Created by Vladislav on 30.10.2014.
 */
public class First {
    public static void main(String[] args) {
        System.out.println("949:");
        System.out.println(Integer.toBinaryString(949));
        System.out.println(Integer.toOctalString(949));
        System.out.println(Integer.toHexString(949));
        System.out.println();
        System.out.println("763:");
        System.out.println(Integer.toBinaryString(763));
        System.out.println(Integer.toOctalString(763));
        System.out.println(Integer.toHexString(763));
        System.out.println();
        System.out.println("994,125:");
        System.out.println(Integer.toBinaryString(994) + "." + Integer.toBinaryString(125));
        System.out.println(Integer.toOctalString(994) + "." + Integer.toOctalString(125));
        System.out.println(Integer.toHexString(994) + "." + Integer.toHexString(125));
        System.out.println();
        System.out.println("523,25:");
        System.out.println(Integer.toBinaryString(523) + "." + Integer.toBinaryString(25));
        System.out.println(Integer.toOctalString(523) + "." + Integer.toOctalString(25));
        System.out.println(Integer.toHexString(523) + "." + Integer.toHexString(25));
        System.out.println();
        System.out.println("203,82:");
        System.out.println(Integer.toBinaryString(203) + "." + Integer.toBinaryString(82));
        System.out.println(Integer.toOctalString(203) + "." + Integer.toOctalString(82));
        System.out.println(Integer.toHexString(203) + "." + Integer.toHexString(82));
    }
}
