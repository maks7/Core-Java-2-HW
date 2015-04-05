package com.hackbulgaria.task9.todolist;

public class GoOutTask extends Task {

    public GoOutTask() {
        taskName = "GoOutTask";
        priority = 5;
        duration = 1;
    }
    
    public GoOutTask(int prio) {
        taskName = "GoOutTask";
        priority = prio;
        duration = 1;
    }
    
    public GoOutTask(double d) {
        taskName = "GoOutTask";
        priority = 5;
        duration = d;
    }
}
