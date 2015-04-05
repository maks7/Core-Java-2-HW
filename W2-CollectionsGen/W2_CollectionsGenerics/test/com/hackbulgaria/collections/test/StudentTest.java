package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task7.students.Student;
import com.hackbulgaria.task7.students.Utils;

public class StudentTest {

    Student st;
    
    @Before
    public void before() {
        
    }
    
    @Test
    public void test() {
        
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("John", 5));
        arr.add(new Student("Robert", 4));
        arr.add(new Student("Sophia", 4));
        arr.add(new Student("Elia", 5));
        //System.out.println("Before sort:");
        //System.out.println(arr);        
        
        ArrayList<Student> actual = Utils.sort(arr);
        //System.out.println(actual);
        
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(new Student("Elia", 5));
        expected.add(new Student("John", 5));
        expected.add(new Student("Robert", 4));
        expected.add(new Student("Sophia", 4));
        //System.out.println(expected);
        
        assertEquals(expected.get(0), actual.get(0));
        assertEquals(expected.get(1), actual.get(1));
        assertEquals(expected.get(2), actual.get(2));
        assertEquals(expected.get(3), actual.get(3));
    }

}
