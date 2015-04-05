package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task8.median.StatisticsImpl;

public class StatisticsTest_2 {

    StatisticsImpl stat;
    
    @Before
    public void before() {
        
        List<Integer> arr = new ArrayList<>();
        int[]  values = new int[] {1, 2, 4, 7};
        for (int i : values) {
            arr.add(i);
        }

        stat = new StatisticsImpl(arr);
    }

    @Test
    public void test_Mean_1() {
        
        assertEquals(3.5, stat.getMean(), 0.01);
    }
    
    @Test
    public void test_Median_1() {
        
        assertEquals(3, stat.getMedian(), 0.1);
    }
    
    @Test
    public void test_Mode_1() {
        
        assertEquals("none", stat.getMode());
    }
    
    @Test
    public void test_Range_1() {
        
        assertEquals(6, stat.getRange());
    }

    @Test
    public void test_Mode_2() {
        
        List<Integer> arr2 = new ArrayList<>();
        int[]  values2 = new int[] {1, 2, 4, 7, 1, 1, 2, 4, 1, 4};
        for (int i : values2) {
            arr2.add(i);
        }

        StatisticsImpl stat2 = new StatisticsImpl(arr2);

        assertEquals("1", stat2.getMode());
    }
    
    @Test
    public void test_Mode_3() {
        
        List<Integer> arr2 = new ArrayList<>();
        int[]  values2 = new int[] {1, 2, 1, 2, 1, 2};
        for (int i : values2) {
            arr2.add(i);
        }

        StatisticsImpl stat2 = new StatisticsImpl(arr2);

        assertEquals("none", stat2.getMode());
    }
    
}
