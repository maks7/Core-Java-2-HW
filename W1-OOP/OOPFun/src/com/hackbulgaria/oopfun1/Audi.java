package com.hackbulgaria.oopfun1;

import java.util.Date;

public class Audi extends Car implements UserView {

    Audi() {
        this.brand = "Audi";
        this.manifactureDate = new Date();
    }

    Audi(Date date) {
        this.brand = "Audi";
        this.manifactureDate = date;
    }

    @Override
    public int getMileage() {
        // TODO Auto-generated method stub
        return mileage;
    }

    @Override
    public String toString() {
        return super.toString() + ", mileage: " + this.getMileage();
    }
    
}
