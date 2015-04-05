package com.hackbulgaria.collections.test;

import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task11.count.CollectionsUtility;

public class CollectionsUtility2Test {

    CollectionsUtility coll;
    
    @Before
    public void before() {
        coll = new CollectionsUtility();
    }
    
    @Test
    public void test() {

        
        System.out.println("{ Ninjas:1, are:2, all:2, over:1, the:1, place!:1, We:1, going:1, to:1, die!:1 }");
        
        Map<String, Integer> result = coll.countWordsInText("Ninjas are all over the place! We are all going to die!");
        System.out.println(result);
        
        // { Ninjas:1, are:2, all:2, over:1, the:1, place!:1, We:1, going:1, to:1, die!:1 }
        
    }

}
