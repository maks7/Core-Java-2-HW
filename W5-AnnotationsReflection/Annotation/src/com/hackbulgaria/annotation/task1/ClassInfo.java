package com.hackbulgaria.annotation.task1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface ClassInfo {

    public String author();
    public int revision() default 1;
    public boolean isChecked() default true;
    public Class<?>[] arrayClass();
 
}