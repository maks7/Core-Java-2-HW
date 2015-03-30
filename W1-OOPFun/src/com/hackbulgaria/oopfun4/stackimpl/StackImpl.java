package com.hackbulgaria.oopfun4.stackimpl;

import java.util.LinkedList;

public class StackImpl implements Stack {

    protected LinkedList ll;
    
    public StackImpl() {
        this.ll = new LinkedList();
    }

    @Override
    public void push(Object obj) {
        ll.push(obj);
    }

    @Override
    public Object peek() {
        return (Object) ll.peek();
    }

    @Override
    public Object pop() {
        return (Object) ll.pop();
    }

    @Override
    public void clear() {
        ll.clear();
     }

    @Override
    public boolean isEmpty() {
        if(ll.size() == 0)
            return true;
        else {
            return false;
        }
    }

    @Override
    public int length() {
        return ll.size();
    }
    
    @Override
    public int search(Object o) {
        if(ll.contains(o)) {
            return ll.indexOf(o);
        } else {
            return -1;
        }
    }
}
