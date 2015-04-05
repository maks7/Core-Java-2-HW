package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task4.rotate.CollectionRotation;

public class CollectionRotationTest {

    CollectionRotation cr;
    
    @Before
    public void before() {
        cr = new CollectionRotation();
    }
    
    @Test
    public void test_positive_num1() {
        
        ArrayList<Integer> arrAct = new ArrayList<>();
        arrAct.add(new Integer(1));
        arrAct.add(2);
        arrAct.add(3);
        arrAct.add(4);
        arrAct.add(5);
        arrAct.add(6);
        
        //System.out.println(arrAct);
        ArrayList<Integer> arrExpected = new ArrayList<>();
        arrExpected.add(6);
        
        cr.rotate(arrAct, 1);
        //System.out.println(arrAct);
        assertEquals(arrExpected.get(0), arrAct.get(0));
    }

    @Test
    public void test_positive_num3() {
        
        ArrayList<Integer> arrAct = new ArrayList<>();
        arrAct.add(new Integer(1));
        arrAct.add(2);
        arrAct.add(3);
        arrAct.add(4);
        arrAct.add(5);
        arrAct.add(6);
        
        //System.out.println(arrAct);
        ArrayList<Integer> arrExpected = new ArrayList<>();
        arrExpected.add(4);
        
        cr.rotate(arrAct, 3);
        //System.out.println(arrAct);
        assertEquals(arrExpected.get(0), arrAct.get(0));
    }

    @Test
    public void test_negative_num1() {
        
        ArrayList<Integer> arrAct = new ArrayList<>();
        arrAct.add(new Integer(1));
        arrAct.add(2);
        arrAct.add(3);
        arrAct.add(4);
        arrAct.add(5);
        arrAct.add(6);
        
        //System.out.println(arrAct);
        ArrayList<Integer> arrExpected = new ArrayList<>();
        arrExpected.add(2);
        arrExpected.add(3);
        arrExpected.add(4);
        arrExpected.add(5);
        arrExpected.add(6);
        arrExpected.add(new Integer(1));
        
        cr.rotate(arrAct, -1);
        //System.out.println(arrAct);
        
        assertEquals(arrExpected, arrAct);
    }

    @Test
    public void test_negative_num2() {
        
        ArrayList<Integer> arrAct = new ArrayList<>();
        arrAct.add(new Integer(1));
        arrAct.add(2);
        arrAct.add(3);
        arrAct.add(4);
        arrAct.add(5);
        arrAct.add(6);
        
        //System.out.println(arrAct);
        ArrayList<Integer> arrExpected = new ArrayList<>();
        arrExpected.add(3);
        arrExpected.add(4);
        arrExpected.add(5);
        arrExpected.add(6);
        arrExpected.add(new Integer(1));
        arrExpected.add(2);
        
        
        cr.rotate(arrAct, -2);
        //System.out.println(arrExpected);
        
        assertEquals(arrExpected, arrAct);
    }
    
    @Test
    public void test_set_positive_num3() {
        
        LinkedList<Integer> arrAct = new LinkedList<>();
        arrAct.add(new Integer(1));
        arrAct.add(2);
        arrAct.add(3);
        arrAct.add(4);
        arrAct.add(5);
        arrAct.add(6);
        
        //System.out.println(arrAct);
        LinkedList<Integer> arrExpected = new LinkedList<>();
        arrExpected.add(4);
        arrExpected.add(5);
        arrExpected.add(6);
        arrExpected.add(new Integer(1));
        arrExpected.add(2);
        arrExpected.add(3);
        
        cr.rotate(arrAct, 3);
        //System.out.println(arrAct);
        assertEquals(arrExpected, arrAct);
    }

}
