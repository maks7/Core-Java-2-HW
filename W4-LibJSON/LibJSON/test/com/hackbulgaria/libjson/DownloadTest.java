package com.hackbulgaria.libjson;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task4.downloadfile.Download;

public class DownloadTest {

    Download download;
    
    @Before
    public void setUp() {
        download = new Download();
        
    }
    
    
    @Test
    public void test() {
        
        String str = "http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg";
        String targetPath = "c:\\file";
        download.fileFromTo(str, targetPath);
        
    }

}
