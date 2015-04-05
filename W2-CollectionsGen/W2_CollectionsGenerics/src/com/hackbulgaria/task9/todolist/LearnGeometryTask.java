package com.hackbulgaria.task9.todolist;

public class LearnGeometryTask extends Task {

    public LearnGeometryTask() {
        taskName = "LearnGeometryTask";
        priority = 5;
        duration = 1;
    }
    
    public LearnGeometryTask(int prio) {
        taskName = "LearnGeometryTask";
        priority = prio;
        duration = 1;
    }
    
    public LearnGeometryTask(double d) {
        taskName = "LearnGeometryTask";
        priority = 5;
        duration = d;
    }
}
