package com.hackbulgaria.oopfun5.stackinvariant;

import com.hackbulgaria.oopfun4.stackimpl.StackImpl;

public class StackImplInvariant extends StackImpl implements StackInvariant {

    public StackImplInvariant() {
        super();
    }
    
    @Override
    public void push(Object obj) {
        try {
            if (!super.ll.contains(obj)) {
                super.push(obj);
            } else {
                throw new Exception(obj + " already exist");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
