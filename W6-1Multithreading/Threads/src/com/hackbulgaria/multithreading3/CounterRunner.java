package com.hackbulgaria.multithreading3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * @author Maksim
 * Example with Wait/Notify + Mutex
 */
public class CounterRunner {

    //public static int counter = 0;
    private static long startTime = 0;
    
    public static void main(String[] args) throws InterruptedException {

        Counter counterRef = new Counter();
        Lock lock = new ReentrantLock(); 
        
        startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Worker(counterRef), "Thread-1");
        Thread thread2 = new Thread(new Worker(counterRef), "Thread-2");
        thread1.start();
        
        System.out.println(thread1.getName());
        thread2.start();
        
        thread1.join();
        thread2.join();
        System.out.println(thread2.getName());
        
        System.out.println("counter = " + counterRef.counter);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-startTime));
        
    }

}
