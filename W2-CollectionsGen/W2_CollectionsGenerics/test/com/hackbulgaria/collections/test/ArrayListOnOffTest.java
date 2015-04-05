package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.onoffcollection.ArrayListOnOff;

public class ArrayListOnOffTest {

    ArrayListOnOff<Object> arrOnOff;
    
    @Before
    public void before() {
        arrOnOff = new ArrayListOnOff<>();
    }
    
    @Test
    public void test_OnOff_null() {
        
        arrOnOff.add(null);
        arrOnOff.add(null);
                
        ArrayList<Object> arrExpected = new ArrayList<>();
        arrExpected.add(null);
        arrOnOff.add(null);
               
        assertNotEquals(arrExpected, arrOnOff);
    }

    
    @Test
    public void test_OnOff_Integer_4elements() {
        
        arrOnOff.add(new Integer(5));
        arrOnOff.add(new Integer(10));
        arrOnOff.add(new Integer(15));
        arrOnOff.add(new Integer(5));
        
        ArrayList<Object> arrExpected = new ArrayList<>();
        arrExpected.add(new Integer(10));
        arrExpected.add(new Integer(15));
        
        assertEquals(arrExpected, arrOnOff);
    }

    @Test
    public void test_OnOff_Integer_2elements() {
        
        arrOnOff.add(new Integer(10));
        arrOnOff.add(new Integer(10));
        
        ArrayList<Object> arrExpected = new ArrayList<>();
                
        assertEquals(arrExpected, arrOnOff);
    }

    @Test
    public void test_OnOff_String_4elements() {
        
        arrOnOff.add(new Integer(5));
        arrOnOff.add(new Integer(10));
        arrOnOff.add(new Integer(15));
        arrOnOff.add(new Integer(5));
        
        ArrayList<Object> arrExpected = new ArrayList<>();
        arrExpected.add(new Integer(10));
        arrExpected.add(new Integer(15));
        
        assertEquals(arrExpected, arrOnOff);
    }

}
