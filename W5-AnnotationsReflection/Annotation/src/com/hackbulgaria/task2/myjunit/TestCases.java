package com.hackbulgaria.task2.myjunit;

public class TestCases {

    Sum sumRef;
    
    @Before
    public void setUp_prMedium() {
        System.out.println("In @Before - priority MEDIUM");
        sumRef = new Sum();
    }
    
    @Before(priority=Priority.HIGH)
    public void setUp_prHigh() {
        System.out.println("In @Before - priority HIGH");
        sumRef = new Sum();
    }
    
    @After
    public void tearDown(){
        System.out.println("In @After");
        System.out.println("end test case");
    }
    
    @Test
    public void sumTest1(){
        System.out.println("Test1");
        int a = 4;
        int b = 5;
        long result = sumRef.sum(a, b);
        
        System.out.println("Calculation: " + a + " + " + b + " = " + result);
    }
    
    @Test
    public void sumTest2(){
        System.out.println("Test2");
        int a = 1;
        int b = 2;
        long result = sumRef.sum(a, b);
        
        System.out.println("Calculation: " + a + " + " + b + " = " + result);
    }
    
    
}
