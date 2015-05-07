package com.hackbulgaria.task2.myjunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.TreeSet;

public class RunTest {

    public static void main(String[] args) {

        TreeSet<Method> beforeMethods = new TreeSet<>(new PriorityComparator());
        ArrayList<Method> afterMethods = new ArrayList<>();
        ArrayList<Method> testMethods = new ArrayList<>();
        
        Class<?> testcases = TestCases.class;
        Object object = null;
        
        try {
            object = testcases.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        Method[] methods = testcases.getDeclaredMethods();
        for(Method method : methods) {
            
            if(method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            } else if(method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            } else if(method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            } else {
                System.out.println("Else");
            }
        }
        
        try { 
        for (int i = 0; i < testMethods.size(); i++) {
            if(!beforeMethods.isEmpty()) {
                Method befMethod = beforeMethods.last();
                befMethod.invoke(object, null);
            }
            
            if(!testMethods.isEmpty()) {
                Method testMethod = testMethods.get(i);
                testMethod.invoke(object, null);
            }
            
            if(!afterMethods.isEmpty()) {
                Method aftMethod = afterMethods.get(0);
                aftMethod.invoke(object, null);
            }
        }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        
    }
}
