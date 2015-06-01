package com.hackbulgaria.oopfun1;

import java.util.Date;

public class VW extends Car{

    VW() {
        this.brand = "VW";
        this.manifactureDate = new Date();
    }

    VW(Date date) {
        this.brand = "VW";
        this.manifactureDate = date;
    }
    
}
