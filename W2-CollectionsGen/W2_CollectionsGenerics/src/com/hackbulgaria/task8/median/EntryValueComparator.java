package com.hackbulgaria.task8.median;

import java.util.Comparator;
import java.util.Map;

public class EntryValueComparator implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return compareMethod(o1, o2);
    }

    public int compareMethod(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        int cf = e1.getValue().compareTo(e2.getValue());
        if (cf == 0) {
           cf = e1.getKey().compareTo(e2.getKey());
        }
        return cf;
    }
}
