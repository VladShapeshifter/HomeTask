package com.hometask.task05;

import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;

import java.util.Scanner;

/**
 * Created by bvl on 11/10/2014.
 */
abstract class FractionNumberImp implements com.sourceit.hometask.basic.FractionNumber {
    static int dividend;
    static int divisor;
    static double dValue;
    public void setDividend(int i){
        dividend = i;
    }
    public int getDividend(){
        return dividend;
    }
    public void setDivisor(int i){
        if (i>1) {
            divisor = i;
        } else divisor = DEFAULT_DIVISOR_VALUE;
    }
    public int getDivisor(){
        return divisor;
    }
    public double doubleValue(){
        return dValue;
    }

    public java.lang.String toString(){
        return getDividend() + "/" + getDivisor();
    }


}
