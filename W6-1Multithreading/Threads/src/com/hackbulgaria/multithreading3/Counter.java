package com.hackbulgaria.multithreading3;

public class Counter {

    public static int counter = 0;

    public synchronized void increment() {
        counter++;
    }

}
