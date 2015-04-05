package com.hackbulgaria.task9.todolist;

public class EatTask extends Task {

    public EatTask() {
        taskName = "EatTask";
        priority = 5;
        duration = 1;
    }
    
    public EatTask(int prio) {
        taskName = "EatTask";
        priority = prio;
        duration = 1;
    }
    
    public EatTask(double d) {
        taskName = "EatTask";
        priority = 5;
        duration = d;
    }
}
