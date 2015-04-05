package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.reversecoll1.CollectionsUtil;

public class ReverseCollection_Test {

    CollectionsUtil coll;
    
    @Before
    public void before() {
        coll = new CollectionsUtil();
    }
    
    @Test
    public void test_ArrayList_Integer() {
        
        List<Integer> arrList = new ArrayList<>();
        arrList.add(new Integer(4));
        arrList.add(new Integer(35));
        arrList.add(new Integer(60));
        
        List<Integer> arrListExpected = new ArrayList<>();
        arrListExpected.add(new Integer(60));
        arrListExpected.add(new Integer(35));
        arrListExpected.add(new Integer(4));
        
        ArrayList<Integer> rList = (ArrayList<Integer>) CollectionsUtil.reverse(arrList);
        
        assertEquals(arrListExpected, rList);
    }

    @Test
    public void test_Set_String() {
        
        Set<String> set = new HashSet<>();
        set.add(new String("Select"));
        set.add(new String("Java"));
        set.add(new String("or"));
        set.add(new String("JavaScript"));
        
        Set<String> setExpected = new HashSet<>();
        setExpected.add(new String("JavaScript"));
        setExpected.add(new String("or"));
        setExpected.add(new String("Java"));
        setExpected.add(new String("Select"));
        
        HashSet<String> rSet = (HashSet<String>) CollectionsUtil.reverse(set);
        
        assertEquals(setExpected, rSet);
    }
    
    

}
