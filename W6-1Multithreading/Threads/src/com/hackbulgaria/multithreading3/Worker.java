package com.hackbulgaria.multithreading3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Worker implements Runnable {

    private Counter counter = null;
    //private Lock lock = null;
    private int i = 0;
    
    Worker(Counter counter) {
        this.counter = counter;
        //this.lock = lock;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 2000000; i++) {
            counter.increment();
        }
    }
    

}