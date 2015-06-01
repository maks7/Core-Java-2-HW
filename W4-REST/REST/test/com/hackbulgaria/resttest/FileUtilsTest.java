package com.hackbulgaria.resttest;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task1.FileUtils;

public class FileUtilsTest {

    FileUtils file;
    
    @Before
    public void setUp() {
        file = new FileUtils();
    }
    @Test
    public void test() {
        
        String str = "http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg";
        String targetPath = "c:\\file";
        file.download(str, targetPath);
        
    }

}
