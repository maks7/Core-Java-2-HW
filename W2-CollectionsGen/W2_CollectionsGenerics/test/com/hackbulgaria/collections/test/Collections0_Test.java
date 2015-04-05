package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.collgen0.expression.CheckExp;

public class Collections0_Test {

    CheckExp exp;
    
    @Before
    public void before() {
        exp = new CheckExp();
    }
    
    @Test
    public void test_Wrong_in_middle() {
        
      String str = "()()())))((())(";
        
      assertFalse(exp.isExpressionCorrect(str));
    }

    @Test
    public void test_Whorng_First() {
        
      String str = "))()())))((())(";
        
      assertFalse(exp.isExpressionCorrect(str));
    }

    @Test
    public void test_True1() {
        
      String str = "()()";
        
      assertTrue(exp.isExpressionCorrect(str));
    }

    @Test
    public void test_Wrong_Last() {
        
      String str = "()()(";
        
      assertFalse(exp.isExpressionCorrect(str));
    }
}
