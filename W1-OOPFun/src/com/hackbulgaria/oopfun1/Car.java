package com.hackbulgaria.oopfun1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Car {
    int mileage;
    String brand;
    Date manifactureDate;

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void useYear(int run) {
        this.mileage += run;
    }
    
    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return "Car: " + brand + ", manifacture date: " + dateFormat.format(manifactureDate);
    }

}
