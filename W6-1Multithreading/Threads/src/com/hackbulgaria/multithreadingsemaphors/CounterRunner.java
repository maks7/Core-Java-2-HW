package com.hackbulgaria.multithreadingsemaphors;

import java.util.concurrent.Semaphore;


/**
 * @author Maksim
 * Example with Wait/Notify + Mutex
 */
public class CounterRunner {

    private static long startTime = 0;
    static Semaphore mutex = new Semaphore(1);
    
    public static void main(String[] args) throws InterruptedException {

        Counter counterRef = new Counter();
        
        
        startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Worker(mutex, counterRef), "Thread-1");
        Thread thread2 = new Thread(new Worker(mutex, counterRef), "Thread-2");
        thread1.start();
        
        //System.out.println(thread1.getName());
        thread2.start();
        
        thread1.join();
        thread2.join();
        //System.out.println(thread2.getName());
        
        System.out.println("counter = " + counterRef.counter);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-startTime));
        
    }

}
