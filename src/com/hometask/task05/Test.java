package com.hometask.task05;

import com.sourceit.hometask.basic.FractionNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
<<<<<<< Updated upstream
 * Created by bvl on 11/12/2014.
 */
public class Test {
    public static void main(String[] args) {
        FractionNumberOperationImpl fractionNumberWork = new FractionNumberOperationImpl();
        FractionNumberOperationImpl fractionNumber1 = new FractionNumberOperationImpl();
        FractionNumberOperationImpl fractionNumber2 = new FractionNumberOperationImpl();
        FractionNumber C;
//        C = fractionNumberWork.add(fractionNumber1.parseFractionNumber("1/6"), fractionNumber2.parseFractionNumber("2/4"));
//        System.out.println("Sum = " + C.doubleValue());
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++){

            int nDividend1  = (int)(Math.random()*10);
            int nDivisor1  = (int)(Math.random()*10);
            int nDividend2  = (int)(Math.random()*10);
            int nDivisor2  = (int)(Math.random()*10);

            /*FractionNumberOperationImpl fractionNumberWork = new FractionNumberOperationImpl();
            FractionNumberOperationImpl fractionNumber1 = new FractionNumberOperationImpl();
            FractionNumberOperationImpl fractionNumber2 = new FractionNumberOperationImpl();
            FractionNumber C;*/
            C = fractionNumberWork.add(fractionNumber1.parseFractionNumber(nDividend1+"/"+nDivisor1), fractionNumber2.parseFractionNumber(nDividend2+"/"+nDivisor2));
            arr[i] = C.doubleValue();
//            System.out.println(C);
//            System.out.println(arr[i]);
        }
        System.out.println("Before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

    }
}