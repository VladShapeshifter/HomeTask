package com.hometask.task07;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Vladislav on 24.11.2014.
 */
public class SetUtilsImpl implements SetUtils{

    public SortedSet<String> orderedSet(Collection<Integer> var1, Set<String> var2) throws NullPointerException{

/*        Collection<Integer> integerCollection = new ArrayList<Integer>();
        for (Integer temp : var1){
            integerCollection.add(temp);
        }
        Set<String> stringSet = new TreeSet<String>();
        for (String temp : var2){
            stringSet.add(temp);
        }*/

        SortedSet<String> mySort = new TreeSet<String>();

        if (var1.size() == var2.size()) {
            mySort.addAll(var2);
            mySort.comparator(var2,);
//            mySort.iterator();


        }
        return mySort;
    }

    public Set<Integer> customOrderSet(Integer... var1) throws NullPointerException{
        Set<Integer> integerSet = new LinkedHashSet<Integer>();
        for (Integer temp : var1){
            integerSet.add(temp);
        }
        return integerSet;
    }
}
