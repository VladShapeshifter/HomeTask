package com.hometask.task05;

import com.sourceit.hometask.basic.FractionNumber;

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
        C = fractionNumberWork.add(fractionNumber1.parseFractionNumber("1/4"), fractionNumber2.parseFractionNumber("2/4"));
        System.out.println("Sum = " + C.doubleValue());

    }
}