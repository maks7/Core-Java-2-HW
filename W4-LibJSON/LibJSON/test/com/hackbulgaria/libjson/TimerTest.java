package com.hackbulgaria.libjson;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.jtoaster.Timer;

public class TimerTest {

    Timer timer;
    
    @Before
    public void setUp() {
        timer = new Timer();
    }
    
    @Test
    public void test() {
        
        timer.execute();
    }

}
