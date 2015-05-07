package com.hackbulgaria.annotation.task1;

import java.lang.annotation.Annotation;

@SuppressWarnings(" ")
@ClassInfo(author="AuthorName", revision=1, isChecked=true, arrayClass=Student.class)
public class Student {

    private String name;
    private double grade;
    
    @Override
    public String toString() {
        
        return "Student";
    }
    
    public static void main(String[] args) {
        
        Student student = new Student();
        Annotation[] annotations = student.getClass().getAnnotations();
        
        System.out.println("All annotations:");
        for(Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println();
        
        System.out.println("My annotations:");
        for(Annotation annotation : annotations){
            if(annotation instanceof ClassInfo) {
                ClassInfo classInfo = (ClassInfo) annotation;
                System.out.println(annotation);
                System.out.println("author: "+ classInfo.author());
                System.out.println("revision: "+ classInfo.revision());
                System.out.println("isChecked: "+ classInfo.isChecked());
                System.out.println("arrayClass: "+ classInfo.arrayClass());
            }
        }
    }
}
