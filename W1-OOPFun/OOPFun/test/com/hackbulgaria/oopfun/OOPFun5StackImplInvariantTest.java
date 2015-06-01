package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.oopfun5.stackinvariant.StackImplInvariant;

public class OOPFun5StackImplInvariantTest {

    StackImplInvariant stack;
    
    @Before
    public void before() {
        
        stack = new StackImplInvariant();
    }
    
    @Test
    public void testPush() {

        Object element = new Integer(5);
        
        stack.push(element);
        assertEquals(1, stack.length());
        stack.push(element);
        stack.push(element);
        assertEquals(1, stack.length());
    }
}
