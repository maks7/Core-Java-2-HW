package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task5.firstunique.UniqueElement;

public class FirstUniqueElementTest {

    UniqueElement fUnique;
    
    @Before
    public void before() {
        fUnique = new UniqueElement();
    }
    @Test
    public void testGetFirstUniqueElement_2position() {
        
        Collection<Integer> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
        
        int actual = fUnique.getFirstUniqueElement(ints);
        
        System.out.println(fUnique.getFirstUniqueElement(ints)); //2;
        
        assertEquals(2, actual);
    }

    @Test
    public void testGetFirstUniqueElement_3position() {
        
        Collection<Integer> ints = Arrays.asList(1,1,2,3,4,5,5,4,3,7);
        
        int actual = fUnique.getFirstUniqueElement(ints);
        
        System.out.println(fUnique.getFirstUniqueElement(ints)); //2;
        
        assertEquals(2, actual);
    }

    @Test
    public void testGetFirstUniqueElement_5position() {
        
        Collection<Integer> ints = Arrays.asList(1,1,3,9,9,1,2,8,3,4,5,5,4,3,7);
        
        int actual = fUnique.getFirstUniqueElement(ints);
        
        System.out.println(fUnique.getFirstUniqueElement(ints)); //2;
        
        assertEquals(2, actual);
    }

}
