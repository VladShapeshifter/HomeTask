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
//            System.out.println(Arrays.toString(sArrS));
//            arrayIndex[0] = Integer.parseInt(sArrS[0]);
//            arrayIndex[1] = Integer.parseInt(sArrS[1]);
//            arrayIndex[2] = Integer.parseInt(sArrS[2]);
//            arrayIndex[3] = Integer.parseInt(sArrS[3]);
//            arrayIndex[4] = Integer.parseInt(sArrS[4]);
            for (int i = 0, j = 0; i < sArrS.length; i++, j++) {
                if (sArrS[i].equals(var2)) {
                    arrayIndex[j] = i;
//                    System.out.println(i);
                }
            }
        }
        return arrayIndex;
    }
    public double[] findNumbers(String var1) throws CustomException {
        double[] arrayD = new double[2];
        if (var1.contains(".")) {
            String[] sArrN = var1.split("\\s+");
//            arrayD[0] = Double.parseDouble(sArrN[0]);
//            arrayD[1] = Double.parseDouble(sArrN[1]);
            for (int i = 0, j = 0; i < sArrN.length; i++, j++) {
//                if (sArrN[i].equals(var2)) {
                    double number = Double.parseDouble(sArrN[i]);
                    arrayD[j] = number;
//                    System.out.println(i);
//                }
            }
        } /*else throw new CustomException("Not double value was found in the text");*/
        return arrayD;
    }

    public static void main(String[] args) {
        StringUtilsImpl obj = new StringUtilsImpl();
        System.out.println(obj.div("7", "4"));
        System.out.println(Arrays.toString(obj.findWord("go gogo go", "go")));
        System.out.println(Arrays.toString(obj.findNumbers("12.5 13.6")));
    }
}
