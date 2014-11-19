package com.hometask.task06;
import com.sourceit.hometask.exceptions.CustomException;
import com.sourceit.hometask.exceptions.StringUtils;

import java.util.Arrays;

/**
 * Created by bvl on 11/18/2014.
 */
public class StringUtilsImpl implements StringUtils {
    public double div(String var1, String var2) throws NullPointerException, NumberFormatException, ArithmeticException{
        double nDivinder;
        double nDivisor;
        double result;
        nDivinder = Double.parseDouble(var1);
        nDivisor = Double.parseDouble(var2);
        result = Math.floor(nDivinder / nDivisor);
        return result;
    }
    public int[] findWord(String var1, String var2) throws NullPointerException {
        int[] arrayIndex = new int[3];
        if (var1.contains(var2)) {
            String[] sArrS = var1.split("\\s+");
            for (int i = 0, j = 0; i < sArrS.length; i++, j++) {
                if (sArrS[i].equals(var2)) {
                    arrayIndex[j] = i;
                }
            }
        }
        return arrayIndex;
    }
    public double[] findNumbers(String var1) throws CustomException /*, NumberFormatException*/ {
        double[] arrayD = new double[2];
        if (var1.contains(".")) {
            String[] sArrN = var1.split("\\s+");
            for (int i = 0, j = 0; i < sArrN.length; i++, j++) {
                double number = Double.parseDouble(sArrN[i]);
                /*throw new NumberFormatException("Use double value instead String.");*/
                arrayD[j] = number;
            }
        } else throw new CustomException("Not double value was found in the text.");
        return arrayD;
    }
/*    public static void main(String[] args) {
        StringUtilsImpl obj = new StringUtilsImpl();
        System.out.println(obj.div("7", "4"));
        System.out.println(Arrays.toString(obj.findWord("go gogo go", "go")));
        System.out.println(Arrays.toString(obj.findNumbers("12.5 13.6")));
    }*/
}
