package com.hackbulgaria.corejava;

public class FaultyProblem1 {
    public long getLargestPalindrome(long N) {
        N--;
        if (Utils.isPalindrome(N)) {    // Error (N-1)
            return N;
        } else {
            return getLargestPalindrome(N);
        }
    }

}
