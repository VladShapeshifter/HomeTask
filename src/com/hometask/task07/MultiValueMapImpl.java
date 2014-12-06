package com.hometask.task07;

import com.sourceit.hometask.collections.MultiValueMap;

import java.util.*;

/**
 * Created by Vladislav on 06.12.2014.
 */
public class MultiValueMapImpl<K, V> implements MultiValueMap<K, V> {

    private Map<K, List<V>> map = new HashMap<K, List<V>>();

    @Override
    public String toString() {
        return "MultiValueMapImpl{" +
                "map=" + map +
                '}';
    }

    @Override
    public int getCountValues(K k) {
        if (map.containsKey(k)) {
            List<V> list = map.get(k);
            return list.size();
        }
        return 0;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return  map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for (K key : map.keySet()) {
            List<V> values = map.get(key);
        }

        return false;
    }

    @Override
    public V get(Object o) {
        V v = null;
        if (map.containsValue(o)) {
            List<V> list = map.get(o);
            v = list.get(list.size() - 1);
        }
        return v;
    }

    @Override
    public V put(K key, V value) {
        if (map.containsKey(key)) {
            List<V> listOld = map.get(key);
            listOld.add(value);
        } else {
            List<V> listNew = new ArrayList<V>();
            listNew.add(value);
            map.put(key, listNew);
        }
        return value;
    }

    @Override
    public Iterator<V> getIterator(K k) {
        List<V> list = map.get(k);
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    @Override
    public V remove(Object o) {
        V value = get(o);
        map.remove(o);
        return value;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet()) {
            put(key, m.get(key));
            /*if (map.containsKey(key)) {
                map.get(key).add(m.get(key));
            } else {
                List<V> list = new ArrayList<V>();
                list.add(m.get(key));
                map.put(key, list);
            }*/
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        List<V> list = new ArrayList<V>();
        for (K key : map.keySet()) {
            list.addAll(map.get(key));
        }
        return list;
    }
    // доделать дома!!!
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}

