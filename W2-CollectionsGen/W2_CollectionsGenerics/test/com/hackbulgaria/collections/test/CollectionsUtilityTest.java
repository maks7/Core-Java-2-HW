package com.hackbulgaria.collections.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task10.utility.CollectionsUtility;

public class CollectionsUtilityTest {

    CollectionsUtility coll;
    
    @Before
    public void before() {
        coll = new CollectionsUtility();
    }
    
    
    @Test
    public void test_HashMap_Int_Int() {
        
        Map<Integer, Integer> mapInt = new HashMap<>();
        mapInt.put(new Integer(1), 4);
        mapInt.put(new Integer(2), 3);
        mapInt.put(new Integer(3), 6);
        mapInt.put(new Integer(4), 6);
        mapInt.put(new Integer(5), 2);
        
        System.out.println(mapInt);
        
        System.out.println(coll.getMapToString(mapInt));
        
    }

    @Test
    public void test_TreeMap_Int_Int() {
        
        Map<Integer, Integer> mapInt = new TreeMap<>();
        mapInt.put(new Integer(12), 4);
        mapInt.put(new Integer(10), 3);
        mapInt.put(new Integer(3), 6);
        mapInt.put(new Integer(7), 6);
        mapInt.put(new Integer(4), 2);
        
        System.out.println(mapInt);
        
        System.out.println(coll.getMapToString(mapInt));
    }

    
    @Test
    public void test_HashMap_Str_Str() {
        
        Map<String, String> mapInt = new HashMap<>();
        mapInt.put(new String("hello"), "a");
        mapInt.put(new String("Elia"), "b");
        mapInt.put(new String("World"), "c");
        mapInt.put(new String("Sophia"), "d");
        mapInt.put(new String("Mark"), "e");
        
        System.out.println(mapInt);
        
        System.out.println(coll.getMapToString(mapInt));
    }

}
