package com.hackbulgaria.task3.wc;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WCTest {

    private WC wc;
    private WordCountResult wcResult;
    private WordCountResult expectedWcResult;


    @Before
    public void setUp() {
        wcResult = new WordCountResult();
        wc = new WC();
        expectedWcResult = new WordCountResult();
        
        String str1 = "This-_! method- @ .will *count ()#words?";
        String str2 = "Next line!";
        String str3 = "Three";
        Path path = Paths.get(".\\res\\task3_countLinesWords.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.defaultCharset());) {
            writer.write(str1);
            writer.write("\r\n");
            writer.write(str2);
            writer.write("\r\n");
            writer.write(str3);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        expectedWcResult.setWordsCount(8);
        expectedWcResult.setLinesCount(3);
        expectedWcResult.setCharsCount(37);
    }
    
    @After
    public void tearDown() {
        Path path = Paths.get(".\\res\\task3_countLinesWords.txt");
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test_WordCountResultClass_constuctor() {
        wcResult = new WordCountResult(1, 2, 3);
        //System.out.println(wcResult);
        
        assertEquals(new WordCountResult(1, 2, 3), wcResult);
    }

    @Test
    public void test_WordsCountResultClass_SetMethods() {
        wcResult.setWordsCount(5);
        //System.out.println(wcResult);
        wcResult.setLinesCount(6);
        wcResult.setCharsCount(7);
        //System.out.println(wcResult);
        
        assertEquals(new WordCountResult(5, 6, 7), wcResult);
    }
    
    @Test
    public void test_countWordsChars_mehtod(){
        String str = "This method  will count words";
        String str2 = "This-_! method- @ .will *count ()#words?";
        String str3 = "This a1 as#d";
        
        wc.countWordsChars(str3, wcResult);
        //System.out.println(wcResult);
        
        assertEquals(new WordCountResult(4, 0, 9), wcResult);
    }
    
    @Test
    public void test_wordsCount_mehtod_with_PathParameter(){
        Path path = Paths.get(".\\res\\task3_countLinesWords.txt");
        wcResult = wc.wordCount(path);
        //System.out.println(wcResult);
        
        assertEquals(expectedWcResult, wcResult);
    }

    @Test
    public void test_wordsCount_mehtod_with_FileParameter(){
        File file = new File(".\\res\\task3_countLinesWords.txt");
        wcResult = wc.wordCount(file);
        //System.out.println(wcResult);
        
        assertEquals(expectedWcResult, wcResult);
    }
}
