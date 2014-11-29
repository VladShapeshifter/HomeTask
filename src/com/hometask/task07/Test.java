package com.hometask.task07;

import com.sun.org.apache.xpath.internal.SourceTree;

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

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        CollectionUtilsImpl cui = new CollectionUtilsImpl();
        ArrayList arr1 = new ArrayList();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(5);
        arr1.add(5);
        ArrayList arr2 = new ArrayList();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        System.out.println("Union: " + cui.union(arr1, arr2));
        System.out.println("Intersection: " + cui.intersection(arr1, arr2));
        System.out.println("Union without duplicates: " + cui.unionWithoutDuplicates(arr1, arr2));
        System.out.println("Intersection without duplicates: " + cui.intersectionWithoutDuplicates(arr1, arr2));
        System.out.println("Difference: " + cui.difference(arr1, arr2));

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");

    }
}
