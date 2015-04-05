package com.hackbulgaria.task9.todolist;

public class SleepTask extends Task {

    public SleepTask() {
        taskName = "SleepTask";
        priority = 5;
        duration = 8;
    }
    
    public SleepTask(int prio) {
        taskName = "SleepTask";
        priority = prio;
        duration = 8;
    }
    
    public SleepTask(double d) {
        taskName = "SleepTask";
        priority = 5;
        duration = d;
    }
}
