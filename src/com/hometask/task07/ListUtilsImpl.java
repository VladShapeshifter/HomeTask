package com.hometask.task07;

import com.sourceit.hometask.collections.ListUtils;

import java.util.*;

/**
 * Created by Vladislav on 22.11.2014.
 */
public class ListUtilsImpl implements ListUtils {
    public List<String> asList(String... var1) throws IllegalArgumentException{
        if (var1 == null){
            throw new IllegalArgumentException("Please input String value.");
        }
        List<String> listAdder = new ArrayList<String>();
        for (String vsf : var1) {
            listAdder.add(vsf);
        }
        return listAdder;
    }
    public <T extends Comparable<T>> List<T> sortedList(List<T> var1) throws IllegalArgumentException{
        if (var1 == null){
            throw new IllegalArgumentException("Please input numbers.");
        }
        List<T> arr = new ArrayList<T>();
        for (T sdf : var1){
            arr.add(sdf);
        }
        Collections.sort(arr, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o2.compareTo(o1);
            }
        });
        return arr;
    }
}
