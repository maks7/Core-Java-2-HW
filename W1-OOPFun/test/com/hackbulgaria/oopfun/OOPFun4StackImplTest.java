package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.oopfun4.stackimpl.StackImpl;

public class OOPFun4StackImplTest {

    StackImpl ll;
    
    @Before
    public void before() {
        
        this.ll = new StackImpl();
    }
    
    @Test
    public void testLength_0() {
        
        assertEquals(0, ll.length());
    }
    
    @Test
    public void testLength_1() {
        
        ll.push(new Integer(5));
        assertEquals(1, ll.length());
    }

    @Test
    public void testLength_3() {
        
        ll.push(new Integer(5));
        ll.push(new Integer(50));
        ll.push(new Integer(15));
        assertEquals(3, ll.length());
    }
    
    @Test
    public void testPush() {

        Object element = new Integer(7);
        
        assertEquals(0, ll.length());
        ll.push(element);
        assertEquals(1, ll.length());
    }

    @Test
    public void testPeek() {

        Object element = new Integer(17);
        ll.push(element);
                
        assertEquals(1, ll.length());
        assertEquals(element, ll.peek());
        assertEquals(1, ll.length());
    }

    @Test
    public void testPop() {

        Object element = new Integer(7);
        ll.push(element);
        
        assertEquals(1, ll.length());
        assertEquals(element, ll.pop());
        assertEquals(0, ll.length());
    }

    @Test
    public void testClear() {

        Object element = new Integer(7);
        ll.push(element);
        ll.push(new Integer(18));
        ll.push(new Integer(34));
        
        assertEquals(3, ll.length());
        ll.clear();
        assertEquals(0, ll.length());
        
    }

    @Test
    public void testIsEmpty() {

        assertTrue(ll.isEmpty());
    }

    @Test
    public void testIsEmpty_False() {

        ll.push(new Integer(20));
        assertFalse(ll.isEmpty());
    }

    @Test
    public void testSearch_return0() {
        
        Object element = new Integer(20);
        ll.push(element);
        assertEquals(0, ll.search(element));
    }

    @Test
    public void testSearch_return2() {

        Object element = new Integer(20);
        ll.push(element);
        ll.push(new Integer(10));
        ll.push(new Integer(15));
        assertEquals(2, ll.search(element));
    }

}
