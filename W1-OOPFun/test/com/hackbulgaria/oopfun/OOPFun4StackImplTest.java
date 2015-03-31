package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.oopfun4.stackimpl.StackImpl;

public class OOPFun4StackImplTest {

    StackImpl st;
    
    @Before
    public void before() {
        
        st = new StackImpl();
    }
    
    @Test
    public void testPush_with_Capacity_gt_than_18() {
        
        Random ran = new Random(50);
        Object testO = new Integer(ran.nextInt());
        
      //  for (int i = 0; i < 5; i++) {
            st.push(new Integer(2));
            st.push(new Integer(4));
            st.push(new Integer(8));
            st.push(new Integer(16));
            st.push(new Integer(32));
            st.push(new Integer(64));
         //   System.out.println(i);
           // assertEquals(i+1, st.length());
     //   }
        
        assertEquals(new Integer(8), st.array[2]);
        
        
       // assertEquals(20, st.length());
    }
    
    @Test
    public void testLength_0() {
        
        assertEquals(0, st.length());
    }
    
    @Test
    public void testLength_1() {
        
        st.push(new Integer(5));
        assertEquals(1, st.length());
    }

    @Test
    public void testLength_3() {
        
        st.push(new Integer(5));
        st.push(new Integer(50));
        st.push(new Integer(15));
        assertEquals(3, st.length());
    }
    
    @Test
    public void testPush() {

        Object element = new Integer(7);
        
        assertEquals(0, st.length());
        st.push(element);
        assertEquals(1, st.length());
    }

    @Test
    public void testPush_Add_3_elements() {

        Object element = new Integer(7);
        
       // st.push(element);
        st.push(new Integer(5));
        st.push(new Integer(50));
        
        assertEquals(50, st.peek());
    }

    
    @Test
    public void testPeek() {

        Object element = new Integer(17);
        st.push(element);
                
        assertEquals(1, st.length());
        assertEquals(element, st.peek());
        assertEquals(1, st.length());
    }

    @Test
    public void testPop() {

        Object element = new Integer(7);
        st.push(element);
        
        assertEquals(1, st.length());
        assertEquals(element, st.pop());
        assertEquals(0, st.length());
    }

    @Test
    public void testClear() {

        Object element = new Integer(7);
        st.push(element);
        st.push(new Integer(18));
        st.push(new Integer(34));
        
        assertEquals(3, st.length());
        st.clear();
        assertEquals(0, st.length());
        
    }

    @Test
    public void testIsEmpty() {

        assertTrue(st.isEmpty());
    }

    @Test
    public void testIsEmpty_False() {

        st.push(new Integer(20));
        assertFalse(st.isEmpty());
    }

    @Test
    public void testSearch_return0() {
        
        Object element = new Integer(20);
        st.push(element);
        assertEquals(0, st.search(element));
    }

    @Test
    public void testSearch_return2() {

        Object element = new Integer(20);
        st.push(element);
        st.push(new Integer(10));
        st.push(new Integer(15));
        assertEquals(2, st.search(element));
    }

}
