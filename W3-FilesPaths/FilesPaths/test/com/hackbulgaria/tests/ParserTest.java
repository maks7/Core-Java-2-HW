package com.hackbulgaria.tests;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hackbulgaria.task2.propparser.Parser;

public class ParserTest {

    Parser par;
    Map<String, String> m;
    Map<String, String> expectedMap;
    String fileName = ".\\res\\.properties";

    @BeforeClass
    public static void beforeClass() {
        List<String> list = new ArrayList<>();
        list.add("key = val1");
        list.add("a = val2");
        list.add("b   = val3=val16=val17");
        list.add("   c =     val4");
        list.add(" d = val5    n");
        list.add("e  == val6");
        list.add("f  =#= val6");
        list.add("g  = 15 #= val6");
        list.add("#i  = 45 #= val6");
        list.add("j  = 55 #= val15");
        list.add("=k  = 145 #= val6");
        list.add("m  = 155 #= val15");

        File file = new File(".\\res\\.properties");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : list) {
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;

    }

    @AfterClass
    public static void afterClass() {

        File file = new File(".\\res\\.properties");
        try {
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Before
    public void setUp() {
        par = new Parser();

        expectedMap = new LinkedHashMap<String, String>();
        expectedMap.put("key", " val1");
        expectedMap.put("a", " val2");
        expectedMap.put("b", " val3=val16=val17");
        expectedMap.put("c", "     val4");
        expectedMap.put("d", " val5    n");
        expectedMap.put("e", "= val6");
        expectedMap.put("f", "");
        expectedMap.put("g", " 15 ");
        expectedMap.put("j", " 55 ");
        expectedMap.put("", "k  = 145 ");
        expectedMap.put("m", " 155 ");

    }

    @Test
    public void test_fillOutMap() {

        List<String> list = new ArrayList<>();
        list.add("key = val1");
        list.add("a = val2");
        list.add("b   = val3=val16=val17");
        list.add("   c =     val4");
        list.add(" d = val5    n");
        list.add("e  == val6");
        list.add("f  =#= val6");
        list.add("g  = 15 #= val6");
        list.add("#i  = 45 #= val6");
        list.add("j  = 55 #= val15");
        list.add("=k  = 145 #= val6");
        list.add("m  = 155 #= val15");

        m = par.fillOutMap(list);

        //System.out.println(m);

        assertEquals(expectedMap, m);
    }

    @Test
    public void test_parseProperties() {

        m = par.parseProperties(fileName);

        //System.out.println(m);
        //System.out.println(expectedMap);

        assertEquals(expectedMap, m);
    }

}
