package com.hometask.task05;
import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;
/**
 * Created by bvl on 11/11/2014.
 */
public class FractionNumberOperationImp implements FractionNumberOperation {

    public FractionNumber add(FractionNumber fractionN1, FractionNumber fractionN2){
        int a = fractionN1.getDividend();
        int b = fractionN2.getDivisor();
        int i = a + b;
        String s = Integer.toString(i);
        FractionNumber res = parseFractionNumber(s);
        return res;
    }

    public FractionNumber sub(FractionNumber fractionN1, FractionNumber fractionN2){
        int a = fractionN1.getDividend();
        int b = fractionN2.getDivisor();
        int i = a - b;
        String s = Integer.toString(i);
        FractionNumber res = parseFractionNumber(s);
        return res;
    }

    public FractionNumber mul(FractionNumber fractionN1, FractionNumber fractionN2){
        int a = fractionN1.getDividend();
        int b = fractionN2.getDivisor();
        int i = a * b;
        String s = Integer.toString(i);
        FractionNumber res = parseFractionNumber(s);
        return res;
    }

    public FractionNumber div(FractionNumber fractionN1, FractionNumber fractionN2){
        int a = fractionN1.getDividend();
        int b = fractionN2.getDivisor();
        int i = a / b;
        String s = Integer.toString(i);
        FractionNumber res = parseFractionNumber(s);
        return res;
    }

    public FractionNumber parseFractionNumber(String s){


    }

}
