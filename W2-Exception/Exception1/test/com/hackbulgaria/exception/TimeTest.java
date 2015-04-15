package com.hackbulgaria.exception;

import org.junit.Test;

import com.hackbulgaria.task3.time.Time;

public class TimeTest {

    @Test
    public void test() {

        Time time = new Time("01.01.15 16:34");

        System.out.println(time);
        
    }

    @Test
    public void test_Wrong_Date1() {

        //Time time = new Time("01.01.15 16:34");
        //Time time = new Time("01.01.15 16");
        Time time = new Time("01.01.01 16:34");
        //Time time = new Time("01.01.15 16:34");

        System.out.println(time);
        
    }
    
    @Test
    public void test_Wrong_Date2() {

        //Time time = new Time("01.01.15 16:34");
        //Time time = new Time("01.01.15 16");
        Time time = new Time("31.12.01 16:34");
        //Time time = new Time("01.01.15 16:34");

        System.out.println(time);
        
    }

    @Test
    public void test_Wrong_Minutes1() {

        //Time time = new Time("01.01.15 16:34");
        //Time time = new Time("01.01.15 16");
        Time time = new Time("01.01.01 00:23");
        //Time time = new Time("01.01.15 16:34");

        System.out.println(time);
        
    }

    @Test
    public void test_Wrong_Minutes2() {

        //Time time = new Time("01.01.15 16:34");
        //Time time = new Time("01.01.15 16");
        Time time = new Time("01.01.01 23:01");
        //Time time = new Time("01.01.15 16:34");

        System.out.println(time);
        
    }

    
}
