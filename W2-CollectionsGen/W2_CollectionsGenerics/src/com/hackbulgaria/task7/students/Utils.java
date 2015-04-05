package com.hackbulgaria.task7.students;

import java.util.ArrayList;
import java.util.TreeSet;

public class Utils {
    public static <T> ArrayList<T> sort(ArrayList<T> arr) {
        return new ArrayList<T>(new TreeSet<T>(arr));
    }
}
