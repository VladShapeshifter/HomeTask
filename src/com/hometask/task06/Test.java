package com.hometask.task06;

import com.sourceit.hometask.exceptions.CustomException;

import java.util.Arrays;

/**
 * Created by bvl on 11/19/2014.
 */
public class Test {
    public static void main(String[] args) {
        StringUtilsImpl obj = new StringUtilsImpl();

        System.out.println(obj.div("7", "4"));
        System.out.println(Arrays.toString(obj.findWord("go gogo go", "go")));
        try {
            System.out.println(Arrays.toString(obj.findNumbers("12.5 asd")));
        } catch (NumberFormatException nfe) {
            System.out.println("Use double value instead String.");
        } catch (CustomException ce) {
            System.out.println("Not double value was found in the text.");
        }
        try {
            System.out.println(obj.div("7", "4"));
        } catch (NullPointerException npe) {
            System.out.println("Number1 or number2 are equal null.");
        } catch (NumberFormatException nfe) {
            System.out.println("Number1 or number2 are not a numbers.");
        } catch (ArithmeticException ae) {
            System.out.println("Number2 is equal 0.");
        }
        try {
            System.out.println(Arrays.toString(obj.findWord("go gogo go", "go")));
        } catch (NullPointerException npe) {
            System.out.println("Text or word are equal null, or there is no occurrence of finding word.");
        }
        try {
            System.out.println(Arrays.toString(obj.findNumbers("dfg")));
        } catch (CustomException custom) {
            System.out.println("Not double value was found in the text.");
        }
    }
}
