package com.hometask.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * Created by Vladislav on 31.10.2014.
 */
public class CyclesFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (;i!=0; i/=10){
            sum +=(i%10);

        }
        System.out.println(sum + "");
    }
}
