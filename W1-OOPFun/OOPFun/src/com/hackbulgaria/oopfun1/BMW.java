package com.hackbulgaria.oopfun1;

import java.util.Date;

public class BMW extends Car {

    BMW () {
        this.brand = "BMW";
        this.manifactureDate = new Date();
    }
    
    BMW (Date date) {
        this.brand = "BMW";
        this.manifactureDate = date;
        
    }

}
