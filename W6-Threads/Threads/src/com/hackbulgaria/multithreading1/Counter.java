package com.hackbulgaria.multithreading1;

/**
 * @author Maksim
 * Example with synchronized block
 */
public class Counter {

    public static long counter = 0;
    private static long startTime = 0;
    
    public static void main(String[] args) throws InterruptedException {

        Counter counterRef = new Counter();
        
        startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Worker(counterRef), "Thread-1");
        Thread thread2 = new Thread(new Worker(counterRef), "Thread-2");
        thread1.start();
        
        System.out.println(thread1.getName());
        thread2.start();
        
        thread1.join();
        thread2.join();
        System.out.println(thread2.getName());
        
        System.out.println("counter = " + counter);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-startTime));
        
        
    }

}
