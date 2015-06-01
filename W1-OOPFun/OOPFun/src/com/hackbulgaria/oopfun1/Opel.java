package com.hackbulgaria.oopfun1;

import java.util.Date;

public class Opel extends Car {

    Opel() {
        this.brand = "Opel";
        this.manifactureDate = new Date();
    }

    Opel(Date date) {
        this.brand = "Opel";
        this.manifactureDate = date;
    }

}
