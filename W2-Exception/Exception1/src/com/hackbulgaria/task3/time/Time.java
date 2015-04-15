package com.hackbulgaria.task3.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements TimeFactoryIn {
    private String currentTime;
    private String currentDate;

    public Time() {
        DateFormat dateFormatDate = new SimpleDateFormat("dd/MM/yy");
        this.currentDate = dateFormatDate.format(new Date());
        DateFormat dateFormatTime = new SimpleDateFormat("HH:mm:ss");
        this.currentTime = dateFormatTime.format(new Date());
    }

    public Time(String str) {
        String[] array = str.replaceAll("\\.", "\u002F").split(" ");
        String[] date = array[0].split("\u002F");
        String[] time = array[1].split(":");

        if (array.length < 2) {
            throw new IllegalArgumentException("You have to provide Date and Time in format (01.01.15 17:25)");
        }
        if (date.length < 3) {
            throw new IllegalArgumentException("You have to provide Date in format 01.01.15 (01.01.15 17:25)");
        }
        if (time.length < 2) {
            throw new IllegalArgumentException("You have to provide Time in format 17:25 (01.01.15 17:25)");
        }
        if (date[0].length() > 2 || date[0].length() == 1 || Integer.parseInt(date[0]) < 1
                || Integer.parseInt(date[0]) > 31) {
            throw new IllegalArgumentException("You have to provide Day in format from 01 to 31 (01.01.15 17:25)");
        }
        if (date[1].length() > 2 || date[1].length() == 1 || Integer.parseInt(date[1]) < 1
                || Integer.parseInt(date[1]) > 12) {
            throw new IllegalArgumentException("You have to provide Month in format from 01 to 12 (01.01.15 17:25)");
        }
        if (date[2].length() > 2 || date[2].length() == 1 || Integer.parseInt(date[2]) < 0) {
            throw new IllegalArgumentException("You have to provide Year in format from 01 to 15  (01.01.15 17:25)");
        }

        if (time[0].length() > 2 || time[0].length() == 1 || Integer.parseInt(time[0]) < 0
                || Integer.parseInt(time[0]) > 23) {
            throw new IllegalArgumentException("You have to provide Hours in format from 00 to 23  (01.01.15 17:25)");
        }
        if (time[1].length() > 2 || time[1].length() == 1 || Integer.parseInt(time[1]) < 0
                || Integer.parseInt(time[1]) > 59) {
            throw new IllegalArgumentException("You have to provide Minutes in format from 00 to 59  (01.01.15 17:25)");
        }

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
