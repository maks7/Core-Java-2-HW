package com.hackbulgaria.task5.firstunique;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElement {

    public int getFirstUniqueElement(Collection<Integer> ints) {
        
        int result = 0;
        List<Integer> list = new ArrayList<>(ints);
        
        Set<Integer> duplSet = new HashSet<>();
        List<Integer> subList;
        for (int i = 0; i < list.size(); i++) {
            subList = list.subList(i+1, (list.size()));
            if (subList.contains(list.get(i))) {
                duplSet.add(list.get(i));
            } else if (!duplSet.contains(list.get(i))){
                result = list.get(i);
                break;
            }
        }
        
        return result;
    }
}
