package com.hometask.task07;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Vladislav on 24.11.2014.
 */
public class SetUtilsImpl implements SetUtils {

    public SortedSet<String> orderedSet(Collection<Integer> var1, Set<String> var2) throws NullPointerException {
        ArrayList<Integer> orderedNumbers = new ArrayList<Integer>();
        List<String> nonOrderedLetters = new ArrayList<String>();
        Set<String> set = new LinkedHashSet<String>();
        if (orderedNumbers.size() == nonOrderedLetters.size()) {
            Collections.sort(nonOrderedLetters, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return 0;
                }
            });
        }
        return null;
    }

    public Set<Integer> customOrderSet(Integer... var1) throws NullPointerException {
        Set<Integer> integerSet = new LinkedHashSet<Integer>();
        for (Integer temp : var1){
            integerSet.add(temp);
        }
        return integerSet;
    }

}
