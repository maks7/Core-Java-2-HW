package com.hackbulgaria.oopfun2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements TimeFactoryIn {
    private String currentTime;
    private String currentDate;
    
    Time() {
        DateFormat dateFormatDate = new SimpleDateFormat("dd/MM/yy");
        this.currentDate = dateFormatDate.format(new Date());
        DateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
        this.currentTime = dateFormatTime.format(new Date());
    }
    
    Time(String str) {
        String[] array = str.replaceAll("\\.", "\u002F").split(" ");
        
        this.currentDate = array[0];
        this.currentTime = array[1];
    }
    
    @Override
    public String toString() {
        return this.currentTime + " " + this.currentDate;
    }

    @Override
    public String now() {
        
        return new Time().toString();
    }
}
