package com.hackbulgaria.task9.todolist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ToDoList {

    PriorityQueue<Task> pQueue = new PriorityQueue<>();
    double hoursRemaining;
    
    public ToDoList(double h) {
        hoursRemaining = h;
    }
    
    public void addTask(Task t) {
        pQueue.add(t);
        hoursRemaining -= t.duration;
    }
    
    public void markFinished(Task t) {
        if (pQueue.contains(t)) {
            pQueue.remove(t);
        }
    }
    
    public void markCancelled(Task t) {
        if (pQueue.contains(t)) {
            double hoursTask = 0;
            Task ts = null;
            Iterator<Task> it = pQueue.iterator();
            while(it.hasNext()) {
                ts = it.next();
                if(t.equals(ts)) {
                    hoursTask = ts.duration;
                }
            }
            hoursRemaining += hoursTask;
            pQueue.remove(t);
        }
    }
    
    public Task getTop() {
        return pQueue.peek();
    }
    
    public boolean canFinish() {
        return pQueue.isEmpty();
    }
    
    public int getRemainigTime() {
        return (int) hoursRemaining;
    }
    
    public double getTimeNeeded() {
        double result = 0;
        Task ts = null;
        Iterator<Task> it = pQueue.iterator();
        while (it.hasNext()) {
            ts = it.next();
            result += ts.duration;
        }
        return result;
    }    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Task> it = pQueue.iterator();
        while(it.hasNext()) {
            sb.append(it.next()).append(" \n");
        }
        sb.append("Hours remaining: " + hoursRemaining);
        
        return sb.toString();
    }
}
