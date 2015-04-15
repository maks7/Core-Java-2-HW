package com.hackbulgaria.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task5.immutablelist.ImmutableList;

public class ImmutableListTest {

    ImmutableList<String> immList;
    List<String> list;
    
    @Before
    public void before() {
        list = new ArrayList<>(Arrays.asList("Hello", "World", "Cup"));
        
        immList = new ImmutableList<String>(list);
    }
    
    @Test
    public void test() {

        assertTrue(immList instanceof Serializable);
    }

    @Test
    public void test_defaultConstructor() {

        String str = "str 1";
        str = "str 2";
        System.out.println(str);
        
        list = new ArrayList<>(Arrays.asList("Sofia","Paris", "Athens"));
        immList = new ImmutableList<String>(list);
        
        System.out.println(immList);
        System.out.println(list);
        
        list.add("New Word");
        
        System.out.println(immList);
        System.out.println(list);
    }

    @Test
    public void test_falseMutationFirstElement() {

        list = new ArrayList<>(Arrays.asList("Sofia","Paris", "Athens"));
        immList = new ImmutableList<String>(list);
        
        String str0 = immList.get(0);
        System.out.println(str0);
        str0 = "Berlin";
        System.out.println(immList);
        
        assertEquals("Sofia",immList.get(0));
    }
    
    @Test
    public void test_createImmListWithAsList_method() {

        List<String> expectedList = new ArrayList<>(Arrays.asList("Sofia","Paris", "Athens", "Praha"));
        
        List<String> immList = new ImmutableList<String>().asList("Sofia","Paris", "Athens", "Praha");
        
        System.out.println(immList);
        
        assertEquals(expectedList,immList);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void test_thowsExceptionWhenAddtoEmptyList() {
        
        ImmutableList<String> imm = new ImmutableList<String>();
        imm.add("NewElement");
    }

    @Test (expected = UnsupportedOperationException.class)
    public void test_thowsException_whenAddTo_ImmutableAsList() {
        
        List<String> immList = new ImmutableList<String>().asList("Sofia","Paris", "Athens", "Praha");
        System.out.println(immList);
        immList.add("NewElement");
        
        System.out.println(immList);
    }

}
