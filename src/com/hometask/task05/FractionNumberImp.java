package com.hometask.task05;
import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by bvl on 11/10/2014.
 */
public class FractionNumberImp implements FractionNumber {
    private int dividend;
    private int divisor;
    private double dValue;

    public void setDividend(int i){
        this.dividend = i;
    }
    public int getDividend(){
        return this.dividend;
    }
    public void setDivisor(int i){
        if (i>1) {
            this.divisor = i;
        } else this.divisor = DEFAULT_DIVISOR_VALUE;
    }
    public int getDivisor(){
        return this.divisor;
    }
    public double doubleValue(){
        return this.dValue;
    }

    public String toString(){
        return getDividend() + "/" + getDivisor();
    }



/*    public int compareTo(FractionNumberImp o){
        return Double.compare(getDividend(), o.getDividend());
    }*/
}
