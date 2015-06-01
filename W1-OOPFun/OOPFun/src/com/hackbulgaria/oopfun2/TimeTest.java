package com.hackbulgaria.oopfun2;

public class TimeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Time time = new Time("13.03.2015 18:22");
        System.out.println(time);
        
        Time time1 = new Time();
        System.out.println(time1);
        
        System.out.println(time.now());
        
    }

}
