package com.hackbulgaria.corejava;

import java.util.Arrays;

import com.hackbulgaria.corejava.tests.Problems2Tests;;


public class Problems2Factory {
    String OATH_TOKEN = "THIS IS MY DEAR PASSWORD";

    public static Problems2 createProblems2Instance() {
        return new Problems2Impl();
    }

    public static void main(String[] args) {
        Problems2 prob = Problems2Factory.createProblems2Instance();
        System.out.println(prob.isOdd(3));
        System.out.println(prob.isOdd(4));
        System.out.println(prob.isOdd(-1));
        
        System.out.println();
        System.out.println(prob.isPrime(2));
        System.out.println(prob.isPrime(3));
        System.out.println(prob.isPrime(4));
        System.out.println("5 is prime: "+prob.isPrime(5));
        System.out.println(prob.isPrime(7));
        System.out.println(prob.isPrime(11));
        System.out.println(prob.isPrime(166));
        
        
       //System.out.println(prob.getLargestPalindrome(25000));
        
        // Done
//        System.out.println("Problem 6:");
//        System.out.println(prob.doubleFac(3));
        
        // Done
//        System.out.println("Problem 7:");
//        System.out.println(prob.kthFac(1, 1));
//        System.out.println(prob.kthFac(1, 2));
//        System.out.println(prob.kthFac(1, 3));
//        System.out.println(prob.kthFac(2, 2));
//        System.out.println(prob.kthFac(2, 3));
//        System.out.println(prob.kthFac(3, 1));
//        System.out.println(prob.kthFac(3, 2));            
        
        // Done
//        System.out.println("Problem 9:");
//        System.out.println(prob.getLargestPalindrome(550));
//        System.out.println(prob.getLargestPalindrome(100));
//        System.out.println(prob.getLargestPalindrome(120));
//        System.out.println(prob.getLargestPalindrome(945));
        
        
        short[][] imageGreyStyle = new short[][] {
               new short[] { 100, 120, 245},
               new short[] { 120, 45, 255},
               new short[] { 98, 111, 34},
               new short[] { 100, 120, 20},
               new short[] { 2, 2, 2},
        };
        
//        for (short[] arr : imageGreyStyle) {
//            System.out.println(Arrays.toString(arr));
//        }
        
        // Done
//        System.out.println("Problem 10:");
//        System.out.println(Arrays.toString(prob.histogram(imageGreyStyle)));

        // Done
//        System.out.println("Problem 11:");
//        System.out.println(prob.pow(2, 3));
//        System.out.println(prob.pow(2, 5));
//        System.out.println(prob.pow(3, 3)); 
//        System.out.println(prob.pow(0, 3));
        
        
        int[] array12 = new int[] { 1, 2, 2, 1, 3, 4, 3, 4, 4, 6, 5, 6, 5 };
        int[] array12a = new int[] { 1, 2, 2, 1, 3, 4, 3, 4, 4, 6, 5, 6, 5, 4 };
        // Done
//        System.out.println("Problem 12:");
//        System.out.println(prob.getOddOccurrence(array12));
//        System.out.println(prob.getOddOccurrence(array12a));
        
        
        int[] aVector = new int[] { 2, 5, 3 };
        int[] bVector = new int[] { 5, 4, 1 };
        // Done
//        System.out.println("Problem 13:");
//        System.out.println(prob.maximalScalarSum(aVector, bVector));
        
      //  maxSpan
//      System.out.println("Problem 14:");
//      System.out.println(prob.maxSpan(new int[] {1, 2, 1, 1, 3}));
//      System.out.println(prob.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
//      System.out.println(prob.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
//        System.out.println(prob.maxSpan(new int[] {1, 2, 3}));

        int[] canBalanceArr = new int[] {1, 1, 1, 2, 1};
        int[] canBalanceArr2 = new int[] {2, 1, 1, 2, 1};
        int[] canBalanceArr3 = new int[] {10, 10};
        int[] canBalanceArr4 = new int[] {1, 1, 2, 1, 2, 2};
        
        // Done
//        System.out.println("Problem 15:");
//        System.out.println(prob.canBalance(canBalanceArr));
//        System.out.println(prob.canBalance(canBalanceArr2));
//        System.out.println(prob.canBalance(canBalanceArr3));
//        System.out.println(prob.canBalance(canBalanceArr4));
        
        
        // int[][] rescale(int[][] original, int newWidth, int newHeight)
        
        int[][] imageReScale = new int[][] {
                new int[] { 100, 120, 245, 98, 23, 55, 65, 34},
                new int[] { 120, 45, 255, 95, 234, 123, 46, 102},
                new int[] { 98, 111, 34, 235, 12, 34, 52, 183},
                new int[] { 100, 120, 20, 95, 127, 76, 43, 234},
                new int[] { 34, 140, 120, 195, 23, 69, 82, 23},
                new int[] { 87, 220, 120, 185, 54, 91, 145, 230},
         };
        System.out.println("Problem 16:");
  //      System.out.println(prob.rescale(imageReScale, 8, 6));
        
        int [][] result = prob.rescale(imageReScale, 4, 3);
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
        
        // Done
//        System.out.println("Problem 17:");
//        System.out.println(prob.reverseMe("a"));
//        System.out.println(prob.reverseMe("ab"));
//        System.out.println(prob.reverseMe("abc"));
//        System.out.println(prob.reverseMe(""));
//        System.out.println(prob.reverseMe("abcd"));
//        System.out.println(prob.reverseMe("sd abcd"));

        // Done
//        System.out.println("Problem 18a:");
//        System.out.println(prob.reverseEveryWord("What is this"));
        
      
      System.out.println("Problem 18:");
      System.out.println(prob.isPalindrome("a232A"));
      System.out.println(prob.isPalindrome("A man, a plan, a canal: Panama."));
      System.out.println(prob.isPalindrome("Amore, Roma."));
      

        
        
        // Done
//        System.out.println("Problem 18:");
//        System.out.println(prob.copyEveryChar("tldr", 3));
//        System.out.println(prob.copyEveryChar("t w r", 3));
//        System.out.println(prob.copyEveryChar("t15 e4 67", 2));

        // Done
//        System.out.println("Problem 19:");
//        System.out.println(prob.isPalindrome(121));
//        System.out.println(prob.isPalindrome(55));
//        System.out.println(prob.isPalindrome(125));
//        System.out.println(prob.isPalindrome(1221));
//        System.out.println(prob.isPalindrome(967691));
        
        // Done
//        System.out.println("Problem 19:");
//        System.out.println(prob.getPalindromeLength("taz*zad")); // 2
//        System.out.println(prob.getPalindromeLength("t*tazzad")); // 2
//        System.out.println(prob.getPalindromeLength("taza*ad")); // 1
//        System.out.println(prob.getPalindromeLength("tazadv*vdad")); // 3

        // Done
//        System.out.println("Problem 20:");
//        System.out.println(prob.countOcurrences("da", "daaadaadada"));

        // Done
        //        System.out.println("Problem 21:");
//        System.out.println(prob.decodeURL("kitten%20pic.jpg"));
//        System.out.println(prob.decodeURL("%20"));
//        System.out.println(prob.decodeURL("%3A"));
//        System.out.println(prob.decodeURL("%3D"));
//        System.out.println(prob.decodeURL("%2F"));
//        System.out.println(prob.decodeURL("kitten%20pic.jpg%2Fnew%2Ffolder%20test%3Aexample%3D"));
     
        // Done
//        System.out.println("Problem 22:");
//        System.out.println(prob.sumOfNumbers("6"));
//        System.out.println(prob.sumOfNumbers("12"));
//        System.out.println(prob.sumOfNumbers("as45"));
//        System.out.println(prob.sumOfNumbers("38dfg"));
//        System.out.println(prob.sumOfNumbers("asd12jfkfkf1iwu10dff"));
//        System.out.println(prob.sumOfNumbers("abc123dd34"));
//        System.out.println(prob.sumOfNumbers("12 99 1"));

        // Done
//        System.out.println("Problem 23:");
//        System.out.println(prob.areAnagrams("tre e", "ee trs")); // false
//        System.out.println(prob.areAnagrams("tre e", "ee tr")); // true
//        System.out.println(prob.areAnagrams("zMarry", "zArmry")); // true
//        System.out.println(prob.areAnagrams("basiparachromatin", "marsipobranchiata")); // true
//        System.out.println(prob.areAnagrams("zArmcy", "zArmry")); // false

        // Done
//        System.out.println("Problem 24:");
//        System.out.println(prob.hasAnagramOf("tre e", "ee trs")); // true
//        System.out.println(prob.hasAnagramOf("tre e", "ewe trs")); // true
//        System.out.println(prob.hasAnagramOf("tre e", "ee tsdf")); // false
//        System.out.println(prob.hasAnagramOf("zMarry", "zArmysdf")); // false
//        System.out.println(prob.hasAnagramOf("basiparachromatin", "marsipobr123345fghanchiata")); // true
        
      
      
        Problems2Tests prob2Tests = new Problems2Tests();
        
        prob2Tests.testIsOdd();
        //prob2Tests.testAnagrams();
        //prob2Tests.testCanBalance();
       //prob2Tests.testRescale();
        
        
        
    }

    public static void meh(Integer k) {
    }
}
