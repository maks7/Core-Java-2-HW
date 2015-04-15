package com.hackbulgaria.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task4.subtitle.Subtitle;

public class SubtitleTest {

    Subtitle sub;
    
    @Before
    public void setUp() {
        sub = new Subtitle();
    }
    
    @Test
    public void test_fixEncoding() {
        
        Path path = Paths.get(".\\res\\lost.s04e11.hdtv.xvid-2hd.srt");
        sub.fixEncoding(path);
        
    }

}
