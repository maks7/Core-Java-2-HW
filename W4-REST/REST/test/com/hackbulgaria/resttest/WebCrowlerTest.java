package com.hackbulgaria.resttest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.webcrowler.WebCrowler;

public class WebCrowlerTest {

    WebCrowler webCrowler;
    
    @Before
    public void setUp() {
        webCrowler = new WebCrowler();
    }
    
    
    @Test
    public void test() {
         String url = "http://ebusiness.free.bg";
         String word = "проект";
         System.out.println(webCrowler.doWebCrowle(url, word));
    }

}
