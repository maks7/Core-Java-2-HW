package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task6.duplelements.Sets;

public class SetsTest {

    Sets sets;
    
    @Before
    public void before() {
        sets = new Sets();
    }
    
    @Test
    public void test_3Sets_Integer() {
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(new Integer(4));
        set1.add(new Integer(7));
        set1.add(new Integer(9));
        set1.add(new Integer(10));
        set1.add(new Integer(15));
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(new Integer(3));
        set2.add(new Integer(9));
        set2.add(new Integer(13));
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(new Integer(2));
        set3.add(new Integer(3));
        set3.add(new Integer(9));
        set3.add(new Integer(11));
        set3.add(new Integer(13));
        
        HashSet<Integer> expected = new HashSet<>();
        expected.add(new Integer(9));
        
        assertEquals(expected, sets.getDuplicateElement(set1, set2, set3));
    }

    @Test
    public void test_2Sets_Integer() {
        
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(new Integer(4));
        set1.add(new Integer(7));
        set1.add(new Integer(9));
        set1.add(new Integer(10));
        set1.add(new Integer(15));
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(new Integer(3));
        set2.add(new Integer(10));
        set2.add(new Integer(13));
        
        HashSet<Integer> expected = new HashSet<>();
        expected.add(new Integer(10));
        
        assertEquals(expected, sets.getDuplicateElement(set1, set2));
    }

    @Test
    public void test_3Sets_Strings() {
        
        HashSet<String> set1 = new HashSet<>();
        set1.add(new String("a"));
        set1.add(new String("b"));
        set1.add(new String("c"));
        set1.add(new String("d"));
        set1.add(new String("e"));
        HashSet<String> set2 = new HashSet<>();
        set2.add(new String("d"));
        set2.add(new String("j"));
        set2.add(new String("i"));
        HashSet<String> set3 = new HashSet<>();
        set3.add(new String("k"));
        set3.add(new String("d"));
        set3.add(new String("l"));
        set3.add(new String("m"));
        set3.add(new String("n"));
        
        HashSet<String> expected = new HashSet<>();
        expected.add(new String("d"));
        
        assertEquals(expected, sets.getDuplicateElement(set1, set2, set3));
    }
}
