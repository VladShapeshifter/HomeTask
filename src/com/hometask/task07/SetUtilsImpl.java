package com.hometask.task07;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Vladislav on 24.11.2014.
 */
public class SetUtilsImpl implements SetUtils {

    public SortedSet<String> orderedSet(Collection<Integer> var1, Set<String> var2) throws NullPointerException {
        ArrayList<String> arrayWords = new ArrayList<String>();
        ArrayList<Integer> arrayNumbers = new ArrayList<Integer>(var1);

        for (String str : var2) {
            arrayWords.add(str);
        }
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arrayWords.size(); i++) {
            map.put(arrayWords.get(i), arrayNumbers.get(i));
        }
        SortedSet<String> ss = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        ss.addAll(var2);


        return ss;
    }

    public Set<Integer> customOrderSet(Integer... var1) throws NullPointerException {
        Set<Integer> integerSet = new LinkedHashSet<Integer>();
        for (Integer temp : var1){
            integerSet.add(temp);
        }
        return integerSet;
    }

}
