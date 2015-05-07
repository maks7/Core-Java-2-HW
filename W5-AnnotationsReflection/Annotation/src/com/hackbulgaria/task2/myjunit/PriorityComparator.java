package com.hackbulgaria.task2.myjunit;

import java.lang.reflect.Method;
import java.util.Comparator;

public class PriorityComparator implements Comparator<Method> {
    
    @Override
    public int compare(Method b1, Method b2) {
        return b1.getAnnotation(Before.class).priority().ordinal() - b2.getAnnotation(Before.class).priority().ordinal();
    }
    
    
}


