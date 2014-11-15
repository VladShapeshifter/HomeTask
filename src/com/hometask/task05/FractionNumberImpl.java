package com.hometask.task05;
import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by bvl on 11/10/2014.
 */
public class FractionNumberImpl implements FractionNumber {
    private int dividend;
    private int divisor;
    private double dValue;

    public FractionNumberImpl(){
//        this.dividend = 0;
//        this.divisor = 1;
    }
//    public FractionNumberImpl(int dividend, int divisor){
//        setDividendAndDivisor(dividend, divisor);
//    }
//    private void setDividendAndDivisor(int dividendArg, int divisorArg){
//        if (divisorArg == 0){
//            throw new IllegalArgumentException("Divide by Zero");
//        }
//        setDividend(dividendArg);
//        setDivisor(divisorArg);
//    }
    public void setDividend(int i){
        this.dividend = i;
    }
    public int getDividend(){
        return this.dividend;
    }
    public void setDivisor(int i){
//        if (i>1) {
//            divisor = i;
//        } else divisor = DEFAULT_DIVISOR_VALUE;
        this.divisor = i;
    }
    public int getDivisor(){
        return this.divisor;
    }
    public double doubleValue(){
        this.dValue = (double)getDividend() / (double)getDivisor();
        return this.dValue;
    }

    public String toString(){
        return this.getDividend() + "/" + this.getDivisor();
    }



    public int compareTo(FractionNumber o){
        return Double.compare(getDividend(), o.getDividend());
    }


}
