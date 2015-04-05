package com.hackbulgaria.task9.todolist;

public class StudyForAlgebraTask extends Task {
    
    public StudyForAlgebraTask() {
        taskName = "StudyForAlgebraTask";
        priority = 5;
        duration = 1;
    }
    
    public StudyForAlgebraTask(int prio) {
        taskName = "StudyForAlgebraTask";
        priority = prio;
        duration = 1;
    }
    
    public StudyForAlgebraTask(double d) {
        taskName = "StudyForAlgebraTask";
        priority = 5;
        duration = d;
    }
}
