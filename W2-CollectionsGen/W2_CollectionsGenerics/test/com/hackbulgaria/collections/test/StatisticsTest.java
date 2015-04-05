package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task8.median.StatisticsImpl;

public class StatisticsTest {

    StatisticsImpl stat;
    
    @Before
    public void before() {
        
        List<Integer> arr = new ArrayList<>();
        int[]  values = new int[] {13, 18, 13, 14, 13, 16, 14, 21, 13};
        for (int i : values) {
            arr.add(i);
        }

        stat = new StatisticsImpl(arr);
    }
    
    @Test
    public void test_add() {
        
        stat = new StatisticsImpl();
        stat.add(4);
        stat.add(11);
        stat.add(15);
        stat.add(3);
        
        System.out.println(stat);
    }
    
    @Test
    public void test_Mean_1() {
        
        assertEquals(15, stat.getMean(), 0.01);
    }
    
    @Test
    public void test_Median_1() {
        
        assertEquals(14, stat.getMedian(), 0.1);
    }
    
    @Test
    public void test_Mode_1() {
        
        assertEquals("13", stat.getMode());
    }
    
    @Test
    public void test_Range_1() {
        
        assertEquals(8, stat.getRange());
    }

    @Test
    public void test_Iterate() {
        
        for (Integer i : stat) {
            System.out.println(i);
        }
    }
    
    
}
