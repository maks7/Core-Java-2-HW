package com.hackbulgaria.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task5.reducepath.FilePath;

public class FilePathTest {

    FilePath filepath;
    
    @Before
    public void setUp() {
        filepath = new FilePath();
    }
    
    @Test
    public void test_up1Directory() {
        
        String str = "\\srv\\..\\";
        String actual = filepath.reduce_file_path(str);
        
        assertEquals("\\", actual);
    }
    
    @Test
    public void test_removeLastSeparator() {
        
        String str = "\\srv\\www\\htdocs\\wtf\\";
        String actual = filepath.reduce_file_path(str);
        
        assertEquals("\\srv\\www\\htdocs\\wtf", actual);
    }

    @Test
    public void test_sameDirectory() {
        
        String str = "\\srv\\.\\.\\.\\.\\.\\";
        String actual = filepath.reduce_file_path(str);
        
        assertEquals("\\srv", actual);
    }

    @Test
    public void test_up3Directories() {
        
        String str = "\\etc\\..\\etc\\..\\etc\\..\\";
        String actual = filepath.reduce_file_path(str);
        
        assertEquals("\\", actual);
    }

    @Test
    public void test_rootSeparator() {
        
        String str = "\\..\\..\\..\\";
        String actual = filepath.reduce_file_path(str);
        
        assertEquals("\\", actual);
    }
}
