package com.hackbulgaria.multithreading1;

public class Worker implements Runnable {

    Counter counter = null;
    
    Worker(Counter counter) {
        this.counter = counter;
    }
    
    @Override
    public void run() {
        increment();
    }
    
    private void increment() {
        synchronized (counter) {
            for (int i = 0; i < 2000000; i++) {
                counter.counter++;
            }
        }
        
    }

}
