package com.hackbulgaria.multithreading4;

public class Counter {

    public static int counter = 0;
    private static boolean isNotified = false;
    private String waitingThreadName = "";
    MonitorObject monitor = new MonitorObject();

    public void increment() {
        System.out.println(Thread.currentThread().getName() + " inside increment()");

        synchronized (monitor) {
            System.out.println(Thread.currentThread().getName() + " inside synchronized 1 ");
            waitingThreadName = "";
            while (!isNotified) {
                try {
                    System.out.println(Thread.currentThread().getName() + " inside while loop. Call wait.");
                    isNotified = true;
                    waitingThreadName = Thread.currentThread().getName();
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isNotified = false;
            counter++;
            
            if (waitingThreadName.equals("")) {
                System.out.println(Thread.currentThread().getName()
                        + " inside synchronized 2. after increment, call notifyAll ");
                isNotified = true;
                waitingThreadName = Thread.currentThread().getName();
                monitor.notifyAll();
            } else {
                isNotified = false;
                System.out.println(Thread.currentThread().getName() + " after waiting, call increment() method");
            }
        }
    }
}
