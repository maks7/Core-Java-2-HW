package com.hackbulgaria.oopfun;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.oopfun3.Pair;

public class OOPFun3PairTest {

    Pair pairObj1;
    Pair pairObj2;
    Pair pairObjStr1;
    Pair pairObjStr2;
    Integer intObj1;
    Integer intObj2;
    Integer intObj3;
    String strObj1;
    String strObj2;
    String strObj3;

    @Before
    public void before() {
        pairObj1 = new Pair();
        pairObj2 = new Pair();
        pairObjStr1 = new Pair();
        pairObjStr2 = new Pair();

        intObj1 = new Integer(5);
        intObj2 = new Integer(10);
        intObj3 = new Integer(3);

        strObj1 = new String("First str");
        strObj2 = new String("Second str");
        strObj3 = new String("Third str");

        pairObj1.setFirst(intObj1);
        pairObj1.setSecond(intObj2);
        pairObj2.setFirst(intObj1);
        pairObj2.setSecond(intObj2);

        pairObjStr1.setFirst(strObj1);
        pairObjStr1.setSecond(strObj2);
        pairObjStr2.setFirst(strObj1);
        pairObjStr2.setSecond(strObj2);

    }

    @Test
    public void testPair_SetGet_First() {

        pairObj1.setFirst(intObj1);
        Integer actual = (Integer) pairObj1.getFirst();

        assertEquals(new Integer(5), actual);

    }

    @Test
    public void testPair_SetGet_Second() {

        pairObj1.setSecond(intObj1);
        Integer actual = (Integer) pairObj1.getSecond();

        assertEquals(new Integer(5), actual);
    }

    @Test
    public void testPair_SameObject() {

        assertEquals(pairObj1, pairObj1);
    }

    @Test
    public void testPair_FirstNull() {

        assertNotEquals(null, pairObj1);
    }

    @Test
    public void testPair_SecondNull() {

        assertNotEquals(pairObj1, null);
    }

    @Test
    public void testPair_EqualsNumbers() {

        assertEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_notEqualsNumbers_SecontDifferent() {
        pairObj1.setFirst(intObj1);
        pairObj1.setSecond(intObj2);
        pairObj2.setFirst(intObj1);
        pairObj2.setSecond(intObj3);

        assertNotEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_notEqualsNumbers_FirstDifferent() {
        pairObj1.setFirst(intObj1);
        pairObj1.setSecond(intObj2);
        pairObj2.setFirst(intObj3);
        pairObj2.setSecond(intObj2);

        assertNotEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_EqualsStrings() {

        assertEquals(pairObjStr1, pairObjStr2);
    }

    @Test
    public void testPair_notEqualsStrings_FirstDifferent() {
        pairObjStr1.setFirst(strObj1);
        pairObjStr1.setSecond(strObj2);
        pairObjStr2.setFirst(strObj3);
        pairObjStr2.setSecond(strObj2);

        assertNotEquals(pairObjStr1, pairObjStr2);
    }

    @Test
    public void testPair_notEqualsStrings_SecondDifferent() {
        pairObjStr1.setFirst(strObj1);
        pairObjStr1.setSecond(strObj2);
        pairObjStr2.setFirst(strObj1);
        pairObjStr2.setSecond(strObj3);

        assertNotEquals(pairObjStr1, pairObjStr2);
    }
    
    @Test
    public void testPair_EqualsNumbers_Args_Null_Number() {
        pairObj1.setFirst(null);
        pairObj1.setSecond(intObj1);
        pairObj2.setFirst(null);
        pairObj2.setSecond(intObj1);

        assertEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_NotEqualsNumbers_Args_Null_Number() {
        pairObj1.setFirst(null);
        pairObj1.setSecond(intObj1);
        pairObj2.setFirst(null);
        pairObj2.setSecond(intObj2);

        assertNotEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_EqualsNumbers_Args_Number_Null() {
        pairObj1.setFirst(intObj1);
        pairObj1.setSecond(null);
        pairObj2.setFirst(intObj1);
        pairObj2.setSecond(null);

        assertEquals(pairObj1, pairObj2);
    }

    @Test
    public void testPair_NotEqualsNumbers_Args_Number_Null() {
        pairObj1.setFirst(intObj1);
        pairObj1.setSecond(null);
        pairObj2.setFirst(intObj2);
        pairObj2.setSecond(null);

        assertNotEquals(pairObj1, pairObj2);
    }

}
