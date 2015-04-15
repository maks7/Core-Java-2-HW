package com.hackbulgaria.task1.fileutils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

public class FileUtilsTest {

    FileUtils fu;
    
    @Before
    public void setUp() {
        fu = FileUtils.getInstance();
    }
    
    @Test
    public void test_SingletonInstance() {
        FileUtils secondObj = FileUtils.getInstance();
        assertTrue(fu == secondObj);
    }
    
    @Test
    public void test_readFromFile() {
        String text = "An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.";
        String textActual = null;
        File file = new File(".\\res\\task1_read.txt");
        try {
            textActual = fu.readFrom(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(text, textActual);
        
    }
    
    @Test
    public void test_readFromPath() {
        String text = "An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.";
        String textActual = null;
        Path path = Paths.get(".\\res\\task1_read.txt");
        
        //System.out.println(path);
        
        try {
            textActual = fu.readFrom(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        assertEquals(text, textActual);
    }

    @Test
    public void test_writeTo_usingFile() {
        String text = "An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.";
        File file = new File(".\\res\\task1_file_write.txt");
        try {
            fu.writeTo(file, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Test
    public void test_writeTo_usingPath() {
        String text = "An object that may be used to locate a file in a file system. It will typically represent a system dependent file path.";
        Path path = Paths.get(".\\res\\task1_path_write.txt");
        
        try {
            fu.writeTo(path, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
