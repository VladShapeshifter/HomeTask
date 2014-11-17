package com.hometask.task05;
import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.FractionNumberOperation;
/**
 * Created by bvl on 11/11/2014.
 */
//dividend - числитель, divisor - знаминатель
public class FractionNumberOperationImpl implements FractionNumberOperation {
    public FractionNumber add(FractionNumber n1, FractionNumber n2){
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(n1.getDividend() * n2.getDivisor() + n1.getDivisor() * n2.getDividend());
        result.setDivisor(n1.getDivisor() * n2.getDivisor());
//        int dividend = n1.getDividend() * n2.getDivisor() + n1.getDivisor() * n2.getDividend();
//        int divisor = n1.getDivisor() * n2.getDivisor();
        return result;
    }

    public FractionNumber sub(FractionNumber n1, FractionNumber n2){
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(n1.getDividend() * n2.getDivisor() - n1.getDivisor() * n2.getDividend());
        result.setDivisor(n1.getDivisor() * n2.getDivisor());
//        int dividend = n1.getDividend() * n2.getDivisor() - n1.getDivisor() * n2.getDividend();
//        int divisor = n1.getDivisor() * n2.getDivisor();
        return result;
    }

    public FractionNumber mul(FractionNumber n1, FractionNumber n2){
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(n1.getDividend() * n2.getDividend());
        result.setDivisor(n1.getDivisor() * n2.getDivisor());
//        int dividend = n1.getDividend() * n2.getDividend();
//        int divisor = n1.getDivisor() * n2.getDivisor();
        return result;
    }

    public FractionNumber div(FractionNumber n1, FractionNumber n2){
        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(n1.getDividend() * n2.getDivisor());
        result.setDivisor(n1.getDivisor() * n2.getDividend());
//        int dividend = n1.getDividend() * n2.getDivisor();
//        int divisor = n1.getDivisor() * n2.getDividend();
        return result;
    }

    public  FractionNumber parseFractionNumber(String s){
        FractionNumberImpl fnTemp = new FractionNumberImpl();
//        s.split("/")[0]
        if (s.contains("/")){
            String[] sArr = s.split("/");
            int sArr0 = Integer.parseInt(sArr[0]);
            int sArr1 = Integer.parseInt(sArr[1]);
            if (sArr1 > 0) {
                fnTemp.setDividend(sArr0);
//            System.out.println(fnTemp.getDividend());
                fnTemp.setDivisor(sArr1);
//            System.out.println(fnTemp.getDivisor());
            } else {
                fnTemp.setDivisor(1);
//                throw new ArithmeticException("Please don't input \"0\".");
            }
        } else{
            fnTemp.setDivisor(FractionNumber.DEFAULT_DIVISOR_VALUE);
        }
    return  fnTemp;
    }

}
