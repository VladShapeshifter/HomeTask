package com.hometask.task07;

import com.sourceit.hometask.collections.MultiValueMap;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        SetUtilsImpl sui = new SetUtilsImpl();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        Set set = new HashSet();
        set.add("a");
        set.add("c");
        set.add("c");
        set.add("u");
        set.add("f");
        System.out.println(sui.orderedSet(arrayList, set));

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");

        MultiValueMap<String, Integer> mvm = new MultiValueMapImpl<String, Integer>();
        mvm.put("one", 1);
        mvm.put("one", 1);
        mvm.put("two", 2);
        mvm.put("three", 3);
        mvm.put("four", 4);
        mvm.put("five", 5);
        System.out.println(mvm);
    }
}
