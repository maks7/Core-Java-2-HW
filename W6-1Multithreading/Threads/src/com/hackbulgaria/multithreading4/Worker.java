package com.hackbulgaria.multithreading4;

public class Worker implements Runnable {

    private Counter counter = null;
    private static int count = 0;
    private final int id;

    Worker(Counter counter) {
        this.counter = counter;
        id = count++;
        System.out.println("Created thread id:" + id);
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            System.out.println("from id: " + id + ", i=" + i);

            counter.increment();
            System.out.println(Thread.currentThread().getName() + " counter = " + counter.counter);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
