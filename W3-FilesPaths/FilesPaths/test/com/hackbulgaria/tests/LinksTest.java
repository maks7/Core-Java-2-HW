package com.hackbulgaria.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task6.links.Links;

public class LinksTest {

    Links links;
    
    @Before
    public void setUp(){
        links = new Links();
    }
    
    @Test
    public void test() {
        
        Path path = Paths.get("c:\\fil\\f");
        links.printBrokenLinks(path);
        
    }

}
