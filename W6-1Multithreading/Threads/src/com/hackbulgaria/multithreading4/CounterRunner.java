package com.hackbulgaria.multithreading4;

/**
 * @author Maksim
 * Example with Wait/Notify + Mutex
 */
public class CounterRunner {

    private static long startTime = 0;
    
    public static void main(String[] args) throws InterruptedException {

        Counter counterRef = new Counter();
        
        startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Worker(counterRef), "Thread-1");
        Thread thread2 = new Thread(new Worker(counterRef), "Thread-2");
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println(Thread.currentThread().getName() + " counter = " + Counter.counter);
        System.out.println("Time elapsed: " + (System.currentTimeMillis()-startTime));
    }

}
