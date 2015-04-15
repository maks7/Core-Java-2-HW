package com.hackbulgaria.exception;

import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hackbulgaria.task4.nonullkeyshashmap.NoNullKeysHashMap;

public class NoNullKeysHashMapTest {

    NoNullKeysHashMap<String, String> noNullkeysMap;
   
    @BeforeClass
    public static void init() {
        
    }
    
    @Before
    public void before() {
        noNullkeysMap = new NoNullKeysHashMap<String, String>();
    }
    
    
    @Test
    public void test_valid_input_NoNullKey() {
        noNullkeysMap.put("one", "oneValue");
        noNullkeysMap.put("two", "twoValue");
        noNullkeysMap.put("three", "threeValue");
        
        System.out.println(noNullkeysMap);
    }

    
    @Test
    public void test_invalid_input_NoNullKey() {
        noNullkeysMap.put("s", "fourValue");
        noNullkeysMap.put("five", "fiveValue");
        noNullkeysMap.put("six", "sixValue");
        
        System.out.println(noNullkeysMap);
        
    }

    
    @Test
    public void test_invalid_input_get_NoNullKey() {
        //HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap = new NoNullKeysHashMap<String, String>();
        hashMap.put("N", "Sophia");
        hashMap.put("M", "London");
        hashMap.put("France", "Paris");
        
        System.out.println(hashMap);
        System.out.println(hashMap.get("s"));
        
    }

    @Test
    public void test_valid_input_Map_NoNullKey_Flag_true() {
        HashMap<String, String> hashMap = new NoNullKeysHashMap<String, String>(false);
        //HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("N", "Sophia");
        hashMap.put("", "London");
        hashMap.put("France", "Paris");
        
        
        HashMap<String, String> hashMapNoNullKeys = new NoNullKeysHashMap<String, String>(hashMap, false);
        
        System.out.println(hashMap);
        System.out.println(hashMapNoNullKeys);
        
        
    }
}
