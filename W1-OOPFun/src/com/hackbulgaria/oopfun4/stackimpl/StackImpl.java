package com.hackbulgaria.oopfun4.stackimpl;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackImpl implements Stack {

    protected LinkedList ll;
    
    private int stackCapacity = 16;
    public Object[] array;
    
    public StackImpl() {
        array = new Object[stackCapacity-1];
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
    
    private Object[] extendArray(int len, Object o) {
        Object[] newArray = new Object[len];
        boolean isObjectAdded = false;
        
        for (int i = 0; i < newArray.length; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                if (!isObjectAdded) { 
                    newArray[i] = o;
                    isObjectAdded = true;
                } else {
                    newArray[i] = null;
                }
            }
        }
        
        return newArray;
    }
    
    @Override
    public void push(Object obj) {

        boolean isDone = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = obj;
                isDone = true;
                break;
            }
            
//            int test1 = array.length;
//            Object testOb3 = array[array.length - 1];
            
//            try {
//                array[array.length] 
//            } catch () {
//                array = extendArray(array.length + stackCapacity, obj);
//            }
//            if (array[array.length - 1] != null) {
////                Object[] extendedArray = new Object[array.length + stackCapacity];
////                array = extendedArray;
//               array = extendArray(array.length + stackCapacity, obj);
           // }
        }
    }

    @Override
    public Object peek() {
        Object result = null;

        try {
            for (int i = array.length - 1; i > -2; i--) {

                if (array[i] != null) {
                    result = array[i];
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }

        return result;
    }

    @Override
    public Object pop() {

        Object result = null;

        try {
            for (int i = array.length - 1; i > -2; i--) {

                if (array[i] != null) {
                    result = array[i];
                    array[i] = null;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }

        return result;
    }

    @Override
    public void clear() {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
     }

    @Override
    public boolean isEmpty() {

        boolean result = true;
        int i = 0;

        while (i < array.length) {
            if (array[i] != null) {
                result = false;
                break;
            }
            i++;
        }

        return result;
    }

    @Override
    public int length() {
        int len = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                len++;
            }
        }
        
        return len;
    }
    
    @Override
    public int search(Object o) {
       
        int result = -1;
        int position = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != null) {
                if (array[i].equals(o)) {
                    result = position;
                    break;
                }
                position++;
            }
        }
        
        return result;
    }
}
