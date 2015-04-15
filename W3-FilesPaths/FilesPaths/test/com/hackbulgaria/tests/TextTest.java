package com.hackbulgaria.tests;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task7.text.Text;

public class TextTest {
    Text text = new Text();
    
    @Before
    public void setUp() {
        text = new Text();
    }
    
    
    @Test
    public void test_compressString() {
        
        String str = "buffalo.";
        
        int dictSize = 256;
        Map<String, Integer> dictionary = new HashMap<>();
        
        for (int i = 0; i < 256; i++) {
            dictionary.put("" + (char)i, i);
        }
        
        System.out.println(text.compressString(str, dictionary));
        
    }

    
    @Test
    public void test_decompressString() {
        
        String str = "buffalo";
        List<Integer> compressed = new ArrayList<>();
        compressed.add(new Integer(98));
        compressed.add(new Integer(117));
        compressed.add(new Integer(102));
        compressed.add(new Integer(102));
        compressed.add(new Integer(97));
        compressed.add(new Integer(108));
        compressed.add(new Integer(111));
        
        int dictSize = 256;
        Map<Integer, String> dictionary = new HashMap<>();

        for (int i = 0; i < 256; i++) {
            dictionary.put(i,"" + (char) i);
        }

        System.out.println(text.decompressString(compressed, dictionary));
        
    }

    @Test
    public void test_compress() {
        
        Path path = Paths.get(".\\res\\task7_2.txt");
        text.compress(path);
    }
  
    @Test
    public void test_decompress() {
        
        Path path = Paths.get(".\\res\\task7_2.compr");
        text.decompress(path);
    }

        
}
