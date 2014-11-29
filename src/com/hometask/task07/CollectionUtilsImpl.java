package com.hometask.task07;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladislav on 27.11.2014.
 */
public class CollectionUtilsImpl implements CollectionUtils {
    public Collection<Integer> union(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {
        Collection<Integer> unionColl = new ArrayList<Integer>();
        unionColl.addAll(var1);
        unionColl.addAll(var2);
        return unionColl;
    }

    public Collection<Integer> intersection(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {
        ArrayList<Integer> intersectionColl1 = new ArrayList<Integer>();
        ArrayList<Integer> intersectionColl2 = new ArrayList<Integer>();
        Collection<Integer> result = new ArrayList<Integer>();
        for (Integer temp : var1){
            intersectionColl1.add(temp);
        }
        for (Integer temp : var2){
            intersectionColl2.add(temp);
        }
//        intersectionColl1.toArray();
        for (int i = 0; i < intersectionColl1.size(); i++){
            for (int j = 0; j < intersectionColl2.size(); j++){
            if (intersectionColl1.get(i) == intersectionColl2.get(j)){
                    result.add(intersectionColl1.get(i));
                }
            }
        }
        return result;
    }

    public Set<Integer> unionWithoutDuplicates(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {
        Set<Integer> unionwdColl = new HashSet<Integer>();
        unionwdColl.addAll(var1);
        unionwdColl.addAll(var2);
        return unionwdColl;
    }

    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {
        ArrayList<Integer> intersectionwdColl1 = new ArrayList<Integer>();
        ArrayList<Integer> intersectionwdColl2 = new ArrayList<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (Integer temp : var1){
            intersectionwdColl1.add(temp);
        }
        for (Integer temp : var2){
            intersectionwdColl2.add(temp);
        }
//        intersectionColl1.toArray();
        for (int i = 0; i < intersectionwdColl1.size(); i++){
            for (int j = 0; j < intersectionwdColl2.size(); j++){
                if (intersectionwdColl1.get(i) == intersectionwdColl2.get(j)){
                    result.add(intersectionwdColl1.get(i));
                }
            }
        }
        return result;
    }

    public Collection<Integer> difference(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {
        ArrayList<Integer> intersectionColl1 = new ArrayList<Integer>();
        ArrayList<Integer> intersectionColl2 = new ArrayList<Integer>();
        ArrayList<Integer> resultOfInters = new ArrayList<Integer>();
        ArrayList<Integer> resultOfUnion = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        //intersection
        for (Integer temp : var1){
            intersectionColl1.add(temp);
        }
        for (Integer temp : var2){
            intersectionColl2.add(temp);
        }
        for (int i = 0; i < intersectionColl1.size(); i++){
            for (int j = 0; j < intersectionColl2.size(); j++){
                if (intersectionColl1.get(i) == intersectionColl2.get(j)){
                    resultOfInters.add(intersectionColl1.get(i));
                }
            }
        }
        //union
        resultOfUnion.addAll(var1);
        resultOfUnion.addAll(var2);
        result = resultOfUnion;
        Integer[] array = resultOfUnion.toArray(new Integer[resultOfUnion.size()]);
//
//        for (int i : resultOfUnion) {
//            for (int ii = 0; ii < array.length; ii++){
//                array[ii] = i;
//            }
//        }

        //(union - intersection)
        for (int i = 0; i < resultOfUnion.size(); i++){
            for (int j = 0; j < resultOfInters.size(); j++){
                if (resultOfUnion.get(i) == resultOfInters.get(j)){
//                    result.remove(resultOfInters.get(i));
                    array[i] = null;
                }
            }
        }
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        for (Integer i : array){
            arrl.add(i);
        }
        for (int i = 0; i < arrl.size(); i++) {
            if (arrl.get(i) == null){
                arrl.remove(i);
            } else continue;
        }
        return arrl;
    }
}
