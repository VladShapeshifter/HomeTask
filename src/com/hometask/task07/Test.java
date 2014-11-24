package com.hometask.task07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav on 22.11.2014.
 */
public class Test {
    public static void main(String[] args) {

        ListUtilsImpl lui = new ListUtilsImpl();
        System.out.println(lui.asList("One", "Two", "Three"));
        List reg = new ArrayList();
        reg.add(6);
        reg.add(1);
        reg.add(5);
        System.out.println(lui.sortedList(reg));


    }
}
