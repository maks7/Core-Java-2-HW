package com.hackbulgaria.multithreadingsemaphors;

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {

    private Counter counter = null;
    private Semaphore mutex = null;
    
    Worker(Semaphore mutex, Counter counter) {
        this.mutex = mutex;
        this.counter = counter;
    }

    @Override
    public void run() {

        int i = 0;
        while (i < 4) {

            System.out.println("i=" + i);
            System.out.println("Thread: " + Thread.currentThread().getName());
            
            try {
                mutex.acquire();

                counter.increment();
                i++;

                mutex.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}