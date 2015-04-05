package com.hackbulgaria.task6.duplelements;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

    public <T> Set<T> getDuplicateElement(Set<T>... args) {
        
        Set<T> result = new HashSet<>();
        Set<T> baseSet = null;
        
        for (int i = 0; i < args.length - 1; i++)
            if (baseSet == null) {
                if (args.length > 1) {
                    if (args[i].size() < args[i + 1].size()) {
                        baseSet = args[i];
                    } else {
                        baseSet = args[i + 1];
                    }
                } else {
                    baseSet = args[i];
                }
            } else {
                if (baseSet.size() > args[i].size()) {
                    baseSet = args[i];
                }
            }            
            
        Iterator<T> it = baseSet.iterator();
        
        for (int i = 0; i < args.length; i++) {
            while (it.hasNext()) {
                T element = it.next();
                if (args[i].contains(element)) {
                    result.add(element);
                }
            }
            it = result.iterator();
        }        
        
        return result;
    }
}
