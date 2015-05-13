package com.hackbulgaria.multithreadingsemaphors;

public class Counter {

    public static int counter = 0;

    public synchronized void increment() {
        counter++;
    }
}
