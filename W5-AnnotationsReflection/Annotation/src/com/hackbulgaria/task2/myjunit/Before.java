package com.hackbulgaria.task2.myjunit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Before {

    public Priority priority() default Priority.MEDIUM;
    
    
}
