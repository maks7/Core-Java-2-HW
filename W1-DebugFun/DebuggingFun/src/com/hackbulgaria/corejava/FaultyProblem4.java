package com.hackbulgaria.corejava;

public class FaultyProblem4 {
    public static boolean areEqual(Integer e, Integer k) {
        //k++;
        //k--;
        return e.equals(k);
    }

    public static boolean areEqual(float a, float b) {
        //return a == b; // error
 
        if(Math.abs(a - b) < 0.00001)
            return true;
        else 
            return false;
    }

    /**
     * Return whether there is an index <b>i</b>,
     * such that a[i,a.length] equals b[i, a.length];
     * @param a
     * @param b
     * @return
     */
    public static boolean haveEqualSubstrings(String a, String b) {
        
        for (int i = 0; i < (b.length() - a.length() + 1); i++) {
            String substringA = a.substring(0, a.length()); // form i
            String substringB = b.substring(i, a.length() + i); // a.length()
            if (substringA.equals(substringB)){
                return true;
            }
        }
        return false;
    }
}
