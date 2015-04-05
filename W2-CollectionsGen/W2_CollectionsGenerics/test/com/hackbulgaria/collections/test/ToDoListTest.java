package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task9.todolist.EatTask;
import com.hackbulgaria.task9.todolist.GoOutTask;
import com.hackbulgaria.task9.todolist.LearnGeometryTask;
import com.hackbulgaria.task9.todolist.SleepTask;
import com.hackbulgaria.task9.todolist.StudyForAlgebraTask;
import com.hackbulgaria.task9.todolist.Task;
import com.hackbulgaria.task9.todolist.ToDoList;

public class ToDoListTest {

    ToDoList todo;
    
    @Before
    public void before() {
        
    }
    
    @Test
    public void test_default_Duration_Priority() {
        
        todo = new ToDoList(11);
        
        todo.addTask(new StudyForAlgebraTask(10));
        todo.addTask(new StudyForAlgebraTask(10));
        todo.addTask(new LearnGeometryTask(6));
        
        
        System.out.println(todo.toString());
        
        todo.markFinished(new StudyForAlgebraTask(10));
        System.out.println(todo.toString());
        
        todo.addTask(new LearnGeometryTask(5));
        System.out.println(todo.toString());
        
        todo.markFinished(new LearnGeometryTask(1.0));
        System.out.println(todo.toString());
        
        todo.addTask(new LearnGeometryTask(7));
        System.out.println(todo.toString());
        todo.markCancelled(new LearnGeometryTask(7));
        System.out.println(todo.toString());
        
        Task top = todo.getTop();
        System.out.println(top);
        
        System.out.println();
        todo.markCancelled(new StudyForAlgebraTask(10));
        todo.addTask(new LearnGeometryTask(10));
        System.out.println(todo.toString());
        top = todo.getTop();
        System.out.println(top);
        System.out.println();
        System.out.println(todo.toString());
        
        System.out.println();
        todo.addTask(new EatTask());
        todo.addTask(new SleepTask());
        todo.addTask(new GoOutTask(1.5));
        System.out.println(todo.getTimeNeeded());
        System.out.println(todo.toString());
        
        System.out.println();
        System.out.println(todo.canFinish());
        
        System.out.println();
        System.out.println(todo.getRemainigTime());
        todo.markCancelled(new SleepTask());
        
        System.out.println();
        System.out.println(todo.toString());
        System.out.println(todo.getRemainigTime());
        
        ToDoList todo2 = new ToDoList(11);
        todo2.addTask(new SleepTask());
        todo2.addTask(new GoOutTask(1.5));
        todo2.addTask(new LearnGeometryTask(10));
        
        System.out.println();
        System.out.println(todo2.toString());
        
        System.out.println();
        todo2.markCancelled(new GoOutTask(1.5));
        System.out.println(todo2.toString());
        System.out.println(todo2.getRemainigTime());
        
        System.out.println();
        todo2.markFinished(new LearnGeometryTask(10));
        System.out.println(todo2.toString());
        System.out.println(todo2.getRemainigTime());
        
        System.out.println();
        todo2.addTask(new StudyForAlgebraTask(8));
        System.out.println(todo2.toString());
        System.out.println(todo2.getRemainigTime());
        
    }
}
