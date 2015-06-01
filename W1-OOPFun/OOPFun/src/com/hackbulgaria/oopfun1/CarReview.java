package com.hackbulgaria.oopfun1;

import java.util.Date;

public class CarReview {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Car carAudi = new Audi();
        System.out.println(carAudi);
        
        carAudi.useYear(12400);
        System.out.println(carAudi);
        
        Car carAudi2 = new Audi(new Date());
        System.out.println(carAudi2);
        
        carAudi2.useYear(16200);
        System.out.println(carAudi2);
        
        carAudi2.useYear(2200);
        System.out.println(carAudi2);
        
        // BMW
        Car carBMW = new BMW();
        System.out.println(carBMW);
        
        carBMW.useYear(5600);
        System.out.println(carBMW);
        
        // VW
        Car carVW = new VW();
        System.out.println(carVW);
        
        carVW.useYear(5600);
        System.out.println(carVW);

        // Opel
        Car carOpel = new Opel();
        System.out.println(carOpel);
        
        carOpel.useYear(5600);
        System.out.println(carOpel);

        
    }

}
