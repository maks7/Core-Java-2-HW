package com.hackbulgaria.task9.todolist;

public abstract class Task implements Comparable<Task> {

    String taskName;
    int priority;
    double duration;
    
    public int compareTo(Task t) {
        return this.priority > t.priority ? -1 : 1; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (Double.doubleToLongBits(duration) != Double.doubleToLongBits(other.duration))
            return false;
        if (priority != other.priority)
            return false;
        if (taskName == null) {
            if (other.taskName != null)
                return false;
        } else if (!taskName.equals(other.taskName))
            return false;
        return true;
    }
    
    public String toString() {
        return "Task: " + taskName + ", priority: " + priority + ", duration: " + duration;
    }
}
